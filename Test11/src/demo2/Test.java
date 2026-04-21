package demo2;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student("A",100);
        Student s2=new Student("B",90);
        ScoreComparator scoreComparator=new ScoreComparator();
        int ret=scoreComparator.compare(s1,s2);
        System.out.println(ret);

    }
}
