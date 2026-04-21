public class Computer {
    // 成员变量
    private String cpu;
    private String memory;
    public String screen;
    String brand;

    // 无参构造方法
    public Computer() {}

    // 有参构造方法
    public Computer(String brand, String cpu, String memory, String screen) {
        this.brand = brand;
        this.cpu = cpu;
        this.memory = memory;
        this.screen = screen;
    }

    // cpu 的 get/set
    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    // memory 的 get/set
    public String getMemory() {
        return memory;
    }
    public void setMemory(String memory) {
        this.memory = memory;
    }

    // brand 的 get/set
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // 开机方法（修正命名）
    public void boot() {
        System.out.println("当前CPU：" + cpu);
        System.out.println("开机~~~");
    }

    // 关机方法（修正命名）
    public void powerOff() {
        System.out.println("关机~~~");
    }

    // toString() 方法
    @Override
    public String toString() {
        return "品牌：" + brand + "，CPU：" + cpu + "，内存：" + memory + "，屏幕：" + screen;
    }
}

