package 设计模式.单例模式.枚举.理解枚举;

interface food{
    void eat();
}

interface sport{
    void run();
}

public enum EnumDemo2 implements food ,sport{
    FOOD,
    SPORT,
    ; //分号分隔

    @Override
    public void eat() {
        System.out.println("eat.....");
    }

    @Override
    public void run() {
        System.out.println("run.....");
    }

    public static void main(String[] args) {
        EnumDemo2.FOOD.eat();
    }
}