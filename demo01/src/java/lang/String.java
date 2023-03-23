package java.lang;

public class String {
        static {
            System.out.println("我是自定义的String类的静态代码块");
        }

    public static void main(String[] args) {
        System.out.println("hello,String");
    }
/*
  双亲委派机制
  一直向上委托给 bootstrapClassLoader 它加载String类发现没有main方法
 */

//    Error: Main method not found in class java.lang.String,
//    please define the main method as:
//   public static void main(String[] args)
//or a JavaFX application class must extend javafx.application.Application
}
