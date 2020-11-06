package 设计模式.单例模式.枚举.理解枚举;

public class Clothes {
    private String code;
    private Color color;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Clothes(String code, Color color) {
        this.code = code;
        this.color = color;
    }
}
