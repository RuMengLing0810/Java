package demo2;

public class Student{
    public String name;
    public int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name +
                ", score=" + score +
                '}';
    }
}
