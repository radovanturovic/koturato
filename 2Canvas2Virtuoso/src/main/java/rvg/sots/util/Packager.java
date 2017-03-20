package rvg.sots.util;

import rvg.Defaults;
import rvg.sots.AttachmentsFrontEntity;
import rvg.sots.manifest.imscp.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * Created by charmingc0d3r on 18.12.16..
 */
public class Packager {
    public static String[] zip(String id, boolean imscc, boolean scorm, String courseName) throws IOException {
        String result[] = new String[2];
        String newSubPath = "download"+ new Random(new Date().getTime()).nextDouble()+(imscc?".imscc":".zip");
        result[0] = newSubPath;
        String newPath = "/tmp/"+newSubPath;
        result[1] = newPath;
        FileOutputStream fos = new FileOutputStream(newPath);
        ZipOutputStream zos = new ZipOutputStream(fos);
        String[] ids = id.split(" ");
        ArrayList<String> files = new ArrayList<String>();
        for (String pid :
                ids) {
            try {
                AttachmentsFrontEntity afe = AttachmentsFrontEntity.getById(Long.parseLong(pid));
                files.add(afe.getCore().getFilename());
                writeZipEntryFile(zos,afe,scorm);
            } catch (NumberFormatException nfe) {}
        }
        if (scorm) {
            ZipInputStream zis = new ZipInputStream(new FileInputStream(Defaults.getSCORMDriverPath()));
            copyZipEntryFiles(zos,zis);
            zis.close();
            writeZipEntryManifest(zos,files,scorm,courseName);
        } else if (imscc) {
            writeZipEntryManifest(zos,files,scorm,courseName);
        }
        zos.close();
        return result;
    }
    private static void writeZipEntryManifest(ZipOutputStream zos, ArrayList<String> files, boolean scorm, String courseName) throws IOException {
        zos.putNextEntry(new ZipEntry("imsmanifest.xml"));
        if (scorm) {
            byte[] buffer = new byte[1024];
            FileInputStream in = new FileInputStream(Defaults.getSCORMManifestPath());
            for (int read = in.read(buffer); read != -1; read = in.read(buffer)) {
                String s = new String(buffer);
                if (s.substring(0,0).equals("1")) {
                    byte[] bytes = ("<title>"+courseName+"</title>").getBytes("UTF-8");
                    zos.write(bytes, 0, bytes.length);
                } else if (s.substring(0,0).equals("2")) {
                    for (String file:files ) {
                        byte[] bytes = ("<file href=\"scormcontent/"+file+"\" /> ").getBytes("UTF-8");
                        zos.write(bytes, 0, bytes.length);
                    }
                } else {
                    zos.write(buffer, 0, read);
                }
            }
            return;
        } else {
            try {
                ManifestType quickXML = new ManifestType();
                OrganizationsType orgst = new OrganizationsType();
                OrganizationType orgt = new OrganizationType();
                orgt.setIdentifier("ftn");
                orgt.setTitle("preuzimanje");
                orgst.getOrganization().add(orgt);
                quickXML.setOrganizations(orgst);
                ResourcesType rest = new ResourcesType();
                ResourceType ret = new ResourceType();
                for (String file:files
                     ) {
                    FileType fit = new FileType();
                    fit.setHref(file);
                    ret.getFile().add(fit);
                }
                rest.getResource().add(ret);
                quickXML.setResources(rest);
                javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(quickXML.getClass().getPackage().getName());
                javax.xml.bind.Marshaller marshaller = jaxbCtx.createMarshaller();
                marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
                marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
                marshaller.marshal(quickXML, zos);

            } catch (javax.xml.bind.JAXBException ex) {
            }
        }
        zos.closeEntry();
    }
    private static void writeZipEntryFile(ZipOutputStream zos, AttachmentsFrontEntity afe, boolean scorm) throws IOException {
        byte[] buffer = new byte[1024];
        ZipEntry ze = new ZipEntry((scorm?"scormcontent/":"")+afe.getCore().getFilename());
        zos.putNextEntry(ze);
        FileInputStream in = new FileInputStream(Defaults.getFullPath(afe));
        int len;
        while ((len = in.read(buffer)) > 0) {
            zos.write(buffer, 0, len);
        }
        in.close();
        zos.closeEntry();
    }
    private static void copyZipEntryFiles(ZipOutputStream zos, ZipInputStream zis) throws IOException {
        byte[] buffer = new byte[1024];
        for (ZipEntry ze = zis.getNextEntry(); ze != null; ze = zis.getNextEntry()) {
                zos.putNextEntry(ze);
                for (int read = zis.read(buffer); read != -1; read = zis.read(buffer)) {
                    zos.write(buffer, 0, read);
                }
                zos.closeEntry();
        }
    }
}
