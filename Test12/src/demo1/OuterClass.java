package demo1;

public class OuterClass {
    public int data1=1;
    private int data2=2;

    public class InnerClass{
        public int data1=111;
        public int data3=3;
        public int data4=4;
        public int data5=5;
        public void testInner{
            System.out.println("内部类被执行");
            System.out.println(OuterClass.this.data1);
            System.out.println(data1);
            System.out.println(data2);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
        }
    }
}
