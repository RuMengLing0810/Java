package demo2;

public class Dog extends Animal {
     public Dog(){
         super("阿华",12);
     }
    public void bark(){
        System.out.println(this.name+"汪");
    }


}
