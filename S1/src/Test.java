public class Test {
    public static void main(String[] args) {
        // 放整数
        Box<Integer> box1 = new Box<>();
        box1.set(100);
        System.out.println(box1.get()); // 输出 100

        // 放字符串
        Box<String> box2 = new Box<>();
        box2.set("你好泛型");
        System.out.println(box2.get()); // 输出 你好泛型
    }
}

