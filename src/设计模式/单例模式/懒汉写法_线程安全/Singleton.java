package 设计模式.单例模式.懒汉写法_线程安全;

class Singleton {
    private static Singleton singleton;

    private Singleton(){}

    public static synchronized Singleton getSingleton() {
        if (singleton == null) singleton = new Singleton();
        return singleton;
    }
}