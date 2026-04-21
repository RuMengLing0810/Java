public class RuMengling {
    //递归求 1 + 2 + 3 + ... + 10
    public static int Sum(int n) {
        if(n==1){
            return 1;
        }else{
            return n+Sum(n-1);
        }
    }
    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)
    public static void Print(int a){
        if(a<=9){
            System.out.print(a+" ");
            return;
        }else{
            Print(a/10);
            System.out.print(a%10+" ");
        }
    }
    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    public static int Sum2(int x) {
        if(x<=9){
            return x;
        }
        return x%10+ Sum2(x/10);

    }
    //递归求斐波那契数列的第 N 项
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);

    }
    //递归求解汉诺塔问题
    public static void hanoi(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.println(A + " → " + C);
            return;
        }
        hanoi(n - 1, A, C, B);// 前面的步骤
        // 第一步

        System.out.println(A + " → " + C);// 当前这一步
        // 第二步

        hanoi(n - 1, B, A, C); // 后面的步骤
        // 第三步


    }
    public static void main(String[] args) {
        int n=10;
        char A='A';
        char B='B';
        char C='C';
        hanoi(n,'A','B','C');
    }
}
