import java.util.Scanner;

public class Test {
    public int lastStringLength(String s){
        int index=s.lastIndexOf(" ");
        if (index == -1) {
            // 没有空格，整个字符串就是一个单词
            return s.length();
        }
        String str=s.substring(index+1);
        return str.length();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        Test t=new Test();
        System.out.println(t.lastStringLength(input));
    }


//    public int firstUniqChar(String s){
//        int[]array=new int[127];
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            array[ch]++;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            char ch=s.charAt(i);
//            if (array[ch] == 1) {
//                return i;
//            }
//        }
//        return -1;
//    }
}
