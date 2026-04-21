package demo2;

public class Cat extends Animal {
    public Cat(){
        super("阿1",13);
    }
    public void mew(){
        System.out.println(this.name+"喵");
    }

}
