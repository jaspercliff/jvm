package com;

public class ClinitTest {
//    初始化阶段就是执行 clinit的过程
    private static int a = 1;  //prepare :a=0 initial a=1
    static {
        a = 2;
        b = 4;
//        System.out.println(a);
//        System.out.println(b);//error： illegal forward reference
    }

    private static  int b = 3; //linking 的prepare b = 0
//    initial b = 4 then b =3
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }

    public ClinitTest(){
//        任何一个类声明以后
//        内部至少存在一个类的构造器
//        是虚拟机视角下的<init>
        a = 10;
        b =20;
    }
}
