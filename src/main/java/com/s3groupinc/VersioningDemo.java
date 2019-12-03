package com.s3groupinc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.JarInputStream;
import java.util.jar.Manifest;

/**
 * Hello world!
 */
public class VersioningDemo {
  public static void main(String[] args) throws IOException {
    InputStream inputstream = new FileInputStream("C:\\Users\\Dinesh Bhagwat\\test\\VersioningDemo\\target\\VersioningDemo" + "" + ".jar");
    JarInputStream jarStream = new JarInputStream(inputstream);
    Manifest mf = jarStream.getManifest();
    Attributes attributes = mf.getMainAttributes();
    String version = attributes.getValue("Implementation-Version");
    System.out.println(version);
  }
}
