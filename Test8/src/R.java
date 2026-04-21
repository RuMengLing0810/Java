public class R {
    public static void main(String[] args) {
        // 创建对象
        Computer computer = new Computer("联想", "Intel i9-13900H", "16GB LPDDR5", "2.5K 120Hz");

        // 调用方法
        computer.boot();
        computer.powerOff();

        // 打印对象
        computer.setCpu("i9"); // 先存进去
        System.out.println(computer.getCpu()); // 再取出来打印
        System.out.println(computer);
    }
}
