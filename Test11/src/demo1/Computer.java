package demo1;

public class Computer {
    public void powerOn(){
        System.out.println("打开笔记本电脑");
    }

    public void powerOff(){
        System.out.println("关闭笔记本电脑");
    }

    // 重点讲这个方法！
    public void useDevice(USB usb){
        // 第一步：调用USB设备的“打开”方法（统一行为）
        usb.openDevice();

        // 第二步：判断设备类型，调用独有功能（向下转型）
        // 如果是鼠标，就调用鼠标的“点击”功能
        if(usb instanceof Mouse){
            ((Mouse)usb).click(); // 向下转型后调用独有方法
        }
        // 如果是键盘，就调用键盘的“输入”功能
        if(usb instanceof KeyBoard){
            ((KeyBoard)usb).inPut(); // 向下转型后调用独有方法
        }

        // 第三步：调用USB设备的“关闭”方法（统一行为）
        usb.closeDevice();
    }
}