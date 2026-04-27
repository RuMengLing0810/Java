package demo1;

public class Exception {
    public static void func(int a){
        if(a==0){
            throw new ArithmeticException("抛出异常");
        }
        System.out.println(10/a);
    }

    public static void main(String[] args) {
        try {
            func(0);
        } catch (ArithmeticException e) {
            System.out.println("异常被捕获");
        }

        System.out.println("成功运行");
    }
}
