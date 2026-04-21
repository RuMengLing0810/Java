import java.util.Scanner;
public class Test4 {
    //两个数判断大小方法
    public static int max(int a,int b) {
        return a>b?a:b;
    }

    //斐波那契数列1 1 2 3 5 8......
    public static int fib(int n) {
        int f1=1;
        int f2=1;
        int f3=0;
        if(n==1||n==2){
            System.out.println(1);
        }
        for (int i = 3; i <=n ; i++) {
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }

    //递归求N的阶乘
    public static long fac(int n){
        if(n==0||n==1){
            return 1;
        }else{
            return n*fac(n-1);
        }
    }



    public static void main(String[] args) {
        int a=10;
        System.out.println(a);

        int ret=fib(5);
        System.out.println(ret);
//        System.out.println(fib(5));
//        System.out.println(fib(6));
//        System.out.println(fib(7));
    }
}
