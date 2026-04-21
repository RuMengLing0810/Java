public class Cat {
    String name;
    String color;

    // 构造方法
    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public void eat() {
        System.out.println("小猫在吃饭");
    }
    @Override
    public String toString() {
        return "小猫名字：" + name + "，颜色：" + color;
    }
}
