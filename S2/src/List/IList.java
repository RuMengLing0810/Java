package List;

public interface IList {

    // 新增元素
    void add(int data);

    // 在指定位置插入
    void add(int index, int data);

    // 获取元素
    int get(int index);

    // 删除指定下标元素
    void remove(int index);

    // 修改元素
    void set(int index, int data);

    // 获取长度
    int size();

    // 判断是否为空
    boolean isEmpty();

    // 打印
    void display();
}