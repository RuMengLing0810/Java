package demo4;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Student[] stus = {
                new Student("张三", 20),
                new Student("李四", 18),
                new Student("王五", 19)
        };

        // 使用 Comparator 按年龄升序
        Arrays.sort(stus, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.age - s2.age;
            }
        });

        // 输出结果
        System.out.println(Arrays.toString(stus));
    }
}