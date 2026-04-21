import java.util.Arrays;
public class RuMengLing {
   //打印数组的方法
    public static String MyToString(int[]arr) {
        String ret="[";
        for (int i = 0; i < arr.length; i++) {
         ret+=arr[i];
            if (i!=arr.length-1)
            {
               ret+=",";
            }
        }
        ret+="]";
        return ret;
    }

    //    实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上.
    public static int[] transform(int[]array) {
        for (int i = 0; i < array.length; i++) {
            array[i]=array[i]*2;
        }
        return array;
    }

    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
    //如数组：[1,2,3,4,5,6]
    //调整后可能是：[1, 5, 3, 4, 2, 6]
    public static int[] AdjustArray(int[]array) {
        int []insert=new int[array.length];
        int left=0;
        int right=array.length-1;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0){
                insert[left]=array[i];
                left++;
            }else{
                insert[right]=array[i];
                right--;
            }
        }
        return insert;
    }
    //给定一个有序整型数组, 实现二分查找
    public static int BinarySearch(int[]array,int key){
        int left = 0;                  // 左边界
        int right = array.length - 1;  // 右边界
        while (left <= right) {
            int mid = (left + right) / 2; // 中间位置
            if (array[mid] == key) {
                return mid; // 找到了！返回下标
            } else if (array[mid] < key) {
                left = mid + 1; // 目标更大 → 去右边找
            } else {
                right = mid - 1; // 目标更小 → 去左边找
            }
        }
        return -1; //

    }
    //给定一个整型数组, 实现冒泡排序(升序排序)
    public static void bubbleSort(int[] array) {
        //// 外层循环：控制一共要比较多少轮（n-1 轮）,最大的在最后
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag=false;
            // 内层循环：每一轮两两比较，把大的往后换
            for (int j = 0; j < array.length - 1 - i; j++) {
                // 前一个 > 后一个 → 交换（升序）
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag=true;
                }
                if(flag=false){
                    break;
                }
            }
        }
    }
    //给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
    //你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复
    //你可以按任意顺序返回答案。
    //示例 1：
    //输入：nums = [2,7,11,15], target = 9
    //输出：[0,1]
    //解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1]
    public static int[] fuc(int[] array,int target){
        int[] ret={-1,-1};
        for (int i = 0; i < array.length; i++) {
            // 第二层循环：遍历i之后的元素（避免重复使用同一个元素）
            for (int j = i + 1; j < array.length; j++) {
                // 判断两数之和是否等于目标值
                if (array[i] + array[j] == target) {
                    // 找到答案，直接返回下标数组
                    return new int[]{i, j};
                }
            }
        }
        return ret;
    }
    //给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
    public static int Find(int[] array){
        int ret=0;
        for (int i = 0; i < array.length; i++) {
            ret^=array[i];
            }
        return ret;
    }
    //给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
    //你可以假设数组是非空的，并且给定的数组总是存在多数元素。
    public static int More(int[] array){
        Arrays.sort(array);
        int ret=array[array.length/2];
        return ret;
    }
    //给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false
    //示例 1：
    //输入：arr = [2,6,4,1]
    //输出：false
    //解释：不存在连续三个元素都是奇数的情况。
    //示例 2：
    //输入：arr = [1,2,34,3,4,5,7,23,12]
    //输出：true
    //解释：存在连续三个元素都是奇数的情况，即 [5,7,23]
    public static boolean Search(int[] arr){
        int ret=0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i]%2!=0){
                ret++;
                if (ret==3){
                    return true;
                }
            }else{
                ret=0;
            }
        }
        return false;
    }
    public static void main(String[] args){

    }
    }

