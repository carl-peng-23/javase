package 设计模式.单例模式.双重校验锁;

class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {}

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
