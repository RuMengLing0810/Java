// 1. 定义一个泛型类：盒子，可以放任意类型东西
class Box<T> {
    private T data; // T 代表任意类型

    // 存数据
    public void set(T data) {
        this.data = data;
    }

    // 取数据
    public T get() {
        return data;
    }
}