package com;

import sun.misc.Launcher;
import sun.net.spi.nameservice.dns.DNSNameService;
import sun.nio.cs.ext.Big5;

import java.net.URL;

public class ClassLoaderTest1 {
    public static void main(String[] args) {
//        获取bootstrapClassLoader能够加载的api路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL);
        }
//        urls随便选一个类
        ClassLoader classLoader = Big5.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);

        System.out.println("=================extensionClassLoader");
        String  extDirs = System.getProperty("java.ext.dirs");
        System.out.println(extDirs);
//        extDirs随便选一个类
        ClassLoader classLoader1 = DNSNameService.class.getClassLoader();
        System.out.println("classLoader1 = " + classLoader1);
    }
}
