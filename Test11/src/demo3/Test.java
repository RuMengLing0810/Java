package demo3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student[] stus = {
                new Student("张三", 20),
                new Student("李四", 18),
                new Student("王五", 19)
        };

        // 直接排序 → 用类自带的 compareTo 规则
        Arrays.sort(stus);
        System.out.println("Comparable 按年龄排序：");
        System.out.println(Arrays.toString(stus));
    }
}