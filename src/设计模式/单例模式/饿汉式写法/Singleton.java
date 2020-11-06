package 设计模式.单例模式.饿汉式写法;

public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }
}
