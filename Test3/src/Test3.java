public class Test3 {
    //打印一到五的阶乘之和
//    public static void main(String[] args) {
//        int sum=0;
//        int ret=1;
//        int num=1;
//        while(num<=5) {
//            ret*=num;//计算当前num阶乘
//            sum+=ret;//累加到总和
//            num++;
//        }
//
//        System.out.println(sum);
//    }
// 求水仙花数
    public static void main(String[] args) {
        for (int i=0; i <= 99999; i++) {
            //计算是几位数
            int count=0;
            int temp=i;//i的值不能变，存在temp里面
            int sum=0;
            while(temp!=0) {
                count++;
                temp/=10;
            }
            temp=i;//123
           //求和
            while(temp!=0) {
                sum+= Math.pow(temp % 10, count);
                temp/=10;
            }
           //判断
            if(i==sum){
                System.out.println(sum);
            }
        }
    }
}
