import List.MyArrayList;
public class Test {
    public static void main(String[] args) {
        MyArrayList list=new MyArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4,5);
        list.add(2,99);
        list.remove(2);
        list.display();
        System.out.println(list.size());
    }
}
