package 设计模式.单例模式.懒汉写法_线程不安全;

class Singleton {
    private static Singleton singleton;

    private Singleton(){}

    public static Singleton getSingleton() {
        if (singleton == null) singleton = new Singleton();
        return singleton;
    }
}
