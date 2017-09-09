select sqlj.install_jar(
	'file:/tmp/2Canvas2Virtuoso.jar',
	'sots_rvg',
	true);

select sqlj.replace_jar(
	'file:/tmp/2Canvas2Virtuoso.jar',
	'sots_rvg',
	true);

select sqlj.install_jar(
	'file:/tmp/jastor.jar',
	'jastor',
	true);

select sqlj.install_jar(
	'file:/tmp/virt_jena.jar',
	'jena',
	true);

select sqlj.install_jar(
	'file:/tmp/virtjdbc.jar',
	'jbdc',
	true);

select sqlj.set_classpath('public','sots_rvg');
select sqlj.set_classpath('public','jastor');
select sqlj.set_classpath('public','jena');
select sqlj.set_classpath('public','jbdc');

CREATE OR REPLACE FUNCTION toVirtNio(
	opera varchar,
	id bigint,
	dispName varchar,
	fojles varchar)
	RETURNS void
	LANGUAGE javaU VOLATILE
	AS 'rvg.sots.PostgresFunctions.toVirtNio(java.lang.String,java.lang.Long,java.lang.String,java.lang.String)';
CREATE OR REPLACE FUNCTION CtoVirt(
	fojles varchar)
	RETURNS void
	LANGUAGE javaU VOLATILE
	AS 'rvg.sots.PostgresFunctions.CtoVirt(java.lang.String)';

CREATE OR REPLACE FUNCTION startup() RETURNS TRIGGER AS $set_id$
   --declare
--	cuva integer;
   BEGIN
--	create or replace function gtr(code text)
--	returns integer language sql as $$
--	    select current_setting('gtr.' || code)::integer;
--	$$;
	perform nextval('gorse');
	raise notice '%', currval('gorse');
--	select currval('gorse')::integer into cuva;
--	set gtr.id to cuva;
	return new;
--	raise notice '%',
   END;
$set_id$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION insce() RETURNS TRIGGER AS $set_id_c$
   BEGIN
	raise notice '%', currval('gorse');
	perform tovirtnio('i', new.id, new.name, 'c' || currval('gorse') || '.rtg');
	return new;
   END;
$set_id_c$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION insae() RETURNS TRIGGER AS $set_id_a$
   BEGIN
	raise notice '%', currval('gorse');
	perform tovirtnio('i', new.id, new.display_name, 'a' || currval('gorse') || '.rtg');
	return new;
   END;
$set_id_a$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION updce() RETURNS TRIGGER AS $set_id_c$
   BEGIN
	raise notice '%', currval('gorse');
	perform tovirtnio('u', new.id, new.name, 'c' || currval('gorse') || '.rtg');
	return new;
   END;
$set_id_c$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION updae() RETURNS TRIGGER AS $set_id_a$
   BEGIN
	raise notice '%', currval('gorse');
	perform tovirtnio('u', new.id, new.display_name, 'a' || currval('gorse') || '.rtg');
	return new;
   END;
$set_id_a$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION fince() RETURNS TRIGGER AS $fin_c$
   BEGIN
	raise notice '%', currval('gorse');
	perform ctovirt('c' || currval('gorse') || '.rtg');
	return new;
   END;
$fin_c$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION finae() RETURNS TRIGGER AS $fin_a$
   BEGIN
	raise notice '%', currval('gorse');
	perform ctovirt('a' || currval('gorse') || '.rtg');
	return new;
   END;
$fin_a$ LANGUAGE plpgsql;

CREATE TRIGGER cstartup before INSERT ON courses
EXECUTE PROCEDURE startup();

CREATE TRIGGER astartup before INSERT ON attachments
EXECUTE PROCEDURE startup();

CREATE TRIGGER cins AFTER INSERT ON courses
FOR EACH ROW EXECUTE PROCEDURE insce();

CREATE TRIGGER ains AFTER INSERT ON attachments
FOR EACH ROW EXECUTE PROCEDURE insae();

CREATE TRIGGER cupd AFTER update ON courses
FOR EACH ROW EXECUTE PROCEDURE updce();

CREATE TRIGGER aupd AFTER update ON attachments
FOR EACH ROW EXECUTE PROCEDURE updae();

CREATE TRIGGER fincit AFTER INSERT ON courses
EXECUTE PROCEDURE fince();

CREATE TRIGGER finait AFTER INSERT ON attachments
EXECUTE PROCEDURE finae();

CREATE TRIGGER fincut AFTER update ON courses
EXECUTE PROCEDURE fince();

CREATE TRIGGER finaut AFTER update ON attachments
EXECUTE PROCEDURE finae();
