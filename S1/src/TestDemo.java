public class TestDemo {
    public static void main(String[] args) {
        MyArray<Integer> myArray=new MyArray();
        myArray.setVal(0,10);
        myArray.setVal(1,12);
        int ret=myArray.getPos(0);
        System.out.println(ret);
    }
}
