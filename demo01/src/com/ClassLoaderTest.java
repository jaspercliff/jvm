package com;

public class ClassLoaderTest {
    public static void main(String[] args) {
//        获取系统类加载器 最下层  他们不是继承关系
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println("systemClassLoader = " + systemClassLoader);
//        获取其上层 扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println("extClassLoader = " + extClassLoader);
//        获取其上层
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println("bootstrapClassLoader = " + bootstrapClassLoader);

//        systemClassLoader = sun.misc.Launcher$AppClassLoader@18b4aac2
//extClassLoader = sun.misc.Launcher$ExtClassLoader@1b6d3586
//bootstrapClassLoader = null

//        用户自定义类来说:默认使用系统类加载器加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);
//        classLoader = sun.misc.Launcher$AppClassLoader@18b4aac2

//        java的核心类库都是使用引导类加载器加载的 bootstrapLoader
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println("classLoader1 = " + classLoader1);//null

    }
}
