BKUPGVR=$(pwd)
if [ -z ${KOTUROOT+x} ]; then
  cd $(dirname $0)/..
  export KOTUROOT=$(pwd)
  cd $BKUPGVR
else
  echo KOTUROOT већ постоји: $KOTUROOT
fi

function virtuoso_gvr_startup {
  BKUPGVR=$(pwd)
  cd $KOTUROOT
  mkdir -p logovi
  mkdir -p logovi/virtuoso
  if [ ! -z ${VIRTUOSO_PIDGVR+x} ];
    then echo "Виртуосо је покренут, убијте га прво са 'ubi:v' наредбом"; return;
  fi
  if [[ ! -e $KOTUROOT/serveri/virtuoso ]]; then
    echo "Изгледа да сервер ниси инсталирао...";
    return;
  fi
  cd $KOTUROOT/serveri/virtuoso
  export VIRTUOSO_LOGGVR=$(echo $KOTUROOT/logovi/virtuoso/$(date +%Y.%m.%d_%H.%M.%S).gvr.log)
  cd var/lib/virtuoso/db
  ./../../../../bin/virtuoso-t -f > $VIRTUOSO_LOGGVR 2>&1 &
  export VIRTUOSO_PIDGVR=$!
  echo 'ПИД за Виртуосо сервер: ' $VIRTUOSO_PIDGVR
  echo 'Користи tl:vts [-f] за праћење стања Виртуосо сервера.'
  alias tl:vts='tail $VIRTUOSO_LOGGVR'
  alias ubi:v='unalias ubi:v; kill $VIRTUOSO_PIDGVR; unset VIRTUOSO_PIDGVR'
  cd $BKUPGVR
}

function canvas_gvr_startup {
  BKUPGVR=$(pwd)
  cd $KOTUROOT
  mkdir -p logovi
  mkdir -p logovi/canvas
  if [ ! -z ${CANVAS_PIDGVR+x} ];
    then echo "Канвас је покренут, убијте га прво са 'ubi:c' наредбом"; return;
  fi
  if [[ ! -e $KOTUROOT/serveri/canvas ]]; then
    echo "Изгледа да сервер ниси инсталирао..."
    return
  fi
  cd $KOTUROOT/serveri/canvas
  export GEM_HOME=$(echo $KOTUROOT'/serveri/canvas/djemsi')
  echo 'Џем кућица: ' $GEM_HOME
  export CANVAS_LOGGVR=$(echo $KOTUROOT/logovi/canvas/$(date +%Y.%m.%d_%H.%M.%S).gvr.log)
  $GEM_HOME/bin/bundle exec rails server > $CANVAS_LOGGVR 2>&1 &
  export CANVAS_PIDGVR=$!
  echo 'ПИД за Канвас сервер: ' $CANVAS_PIDGVR
  echo 'Користи tl:cnv [-f] за праћење стања Канвас сервера.'
  alias tl:cnv='tail $CANVAS_LOGGVR'
  alias ubi:c='unalias ubi:c; kill $CANVAS_PIDGVR; unset CANVAS_PIDGVR'
  cd $BKUPGVR
}

function postgres_gvr_startup {
  cp -vr $KOTUROOT/jdk/jdk8 /tmp/jdk8
  cp -v $KOTUROOT/rsc/pljava.jar /tmp/pljava.jar
  cp -v $KOTUROOT/lib/jastor-1.0.5.jar /tmp/jastor.jar
  cp -v $KOTUROOT/lib/virt_jena3.jar /tmp/virt_jena.jar
  cp -v $KOTUROOT/lib/virtjdbc4.jar /tmp/virtjdbc.jar
  cp -vf $KOTUROOT/out/artifacts/2Canvas2Virtuoso_jar/2Canvas2Virtuoso.jar /tmp/2Canvas2Virtuoso.jar
  for baza in canvas_development canvas_queue_development canvas_test; do
    psql -c "select sqlj.replace_jar('file:/tmp/2Canvas2Virtuoso.jar','sots_rvg',true)" $baza
  done
  mkdir -p /tmp/gtrtDEMON
  chmod a+rw /tmp/gtrtDEMON
  BKUPGVR=$(pwd)
  cd /tmp/gtrtDEMON
  source $KOTUROOT/skripte/ini
  cd $BKUPGVR
}

function glassfish_gvr_startup {
  cp -rf $KOTUROOT/serveri/glassfish /tmp/glassfish
  cp -vf $KOTUROOT/debubicarenje/org.eclipse.persistence.moxy.jar /tmp/glassfish/glassfish/modules/org.eclipse.persistence.moxy.jar
  cp -vf $HOME/.m2/repository/org/jboss/logging/jboss-logging/3.3.0.Final/jboss-logging-3.3.0.Final.jar /tmp/glassfish/glassfish/modules/jboss-logging.jar
  cp -vf $KOTUROOT/2Canvas2Virtuoso/src/main/resources/imsmanifest.xml $KOTUROOT/serveri/canvas/tmp/imsmanifest.xml
  cp -vf $KOTUROOT/2Canvas2Virtuoso/src/main/resources/scormdriver.zip $KOTUROOT/serveri/canvas/tmp/scormdriver.zip
}

function gvr_startup {
  virtuoso_gvr_startup
  canvas_gvr_startup
  postgres_gvr_startup
  glassfish_gvr_startup
}
