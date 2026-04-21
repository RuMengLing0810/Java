public class Phone {
    // 1. 写成员变量
    public String brand;
    public int price;
    // 2. 写有参构造方法
    public Phone(String brand,int price) {
        this.brand=brand;
        this.price=price;
    }
    // 3. 重写toString()
    @Override
    public String toString() {
        return "品牌：" + brand +"，价格：" + price;
    }
}

//public class Test {
//    public static void main(String[] args) {
//        // 4. 创建对象1
//        Phone phone1=new Phone("华为",5999);
//        // 5. 打印对象1
//        System.out.println(phone1);
//    }
//}