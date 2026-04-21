public class Test {
    public static void main(String[] args) {

        // ✅ new 父类 → 调用父类
        Animal a = new Animal();
        a.eat(); // 动物吃

        // ✅ new 子类 → 调用子类
        Animal b = new Dog();
        b.eat(); // 狗吃骨头
    }
}
