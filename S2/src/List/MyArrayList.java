package List;

import List.IList;

public class MyArrayList implements IList {

    // 默认容量
    private static final int DEFAULT_CAPACITY = 10;

    // 底层数组
    private int[] elem;

    // 当前有效元素个数,已经使用多少个元素
    private int usedSize;

    // 构造方法
    public MyArrayList() {
        this.elem = new int[DEFAULT_CAPACITY];
    }

    // 尾插
    @Override
    public void add(int data) {

        // 判断是否满了
        if (isFull()) {
            grow();
        }

        elem[usedSize] = data;
        usedSize++;
    }

    // 指定位置插入
    @Override
    public void add(int index, int data) {

        checkAddIndex(index);

        if (isFull()) {
            grow();
        }

        // 挪动数据
        for (int i = usedSize - 1; i >= index; i--) {
            elem[i + 1] = elem[i];
        }

        elem[index] = data;
        usedSize++;
    }

    // 获取元素
    @Override
    public int get(int index) {

        checkPos(index);

        return elem[index];
    }

    // 删除元素
    @Override
    public void remove(int index) {

        checkPos(index);

        for (int i = index; i < usedSize - 1; i++) {
            elem[i] = elem[i + 1];
        }

        usedSize--;
    }

    // 修改元素
    @Override
    public void set(int index, int data) {

        checkPos(index);

        elem[index] = data;
    }

    // 获取长度
    @Override
    public int size() {
        return usedSize;
    }

    // 判空
    @Override
    public boolean isEmpty() {
        return usedSize == 0;
    }

    // 打印
    @Override
    public void display() {

        for (int i = 0; i < usedSize; i++) {
            System.out.print(elem[i] + " ");
        }

        System.out.println();
    }

    // 判断数组是否满了
    private boolean isFull() {
        return usedSize == elem.length;
    }

    // 扩容
    private void grow() {

        int[] newArray = new int[elem.length * 2];

        for (int i = 0; i < elem.length; i++) {
            newArray[i] = elem[i];
        }

        elem = newArray;
    }

    // 检查获取位置是否合法
    private void checkPos(int index) {

        if (index < 0 || index >= usedSize) {
            throw new RuntimeException("下标不合法");
        }
    }

    // 检查插入位置是否合法
    private void checkAddIndex(int index) {

        if (index < 0 || index > usedSize) {
            throw new RuntimeException("插入位置不合法");
        }
    }
}