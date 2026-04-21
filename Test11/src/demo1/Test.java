package demo1;

public class Test {
    public static void main(String[] args) {
        // 1. 创建电脑、鼠标、键盘对象
        Computer pc = new Computer();
        USB mouse = new Mouse(); // 向上转型（多态）
        USB keyboard = new KeyBoard(); // 向上转型（多态）

        // 2. 电脑开机
        pc.powerOn();

        // 3. 电脑使用鼠标
        System.out.println("===== 使用鼠标 =====");
        pc.useDevice(mouse);

        // 4. 电脑使用键盘
        System.out.println("===== 使用键盘 =====");
        pc.useDevice(keyboard);

        // 5. 电脑关机
        pc.powerOff();
    }
}
