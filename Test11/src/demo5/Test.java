package demo5;
import java.util.Arrays;
import java.util.Comparator;
public class Test {

    public static void main(String[] args) {
        Phone[] phones = {
                new Phone("Huawei", 5999),
                new Phone("Apple",  8999),
                new Phone("Apple", 6999),
                new Phone("Xiaomi", 3999)
        };
        Arrays.sort(phones,new Comparator<Phone>(){
            @Override
            public int compare(Phone o1, Phone o2) {
                int brandCompare=o1.brand.compareTo(o2.brand);
                if(brandCompare!=0){
                    return brandCompare;
                }
                else{
                    return o1.price- o2.price;
                }
            }
        }
                //            @Override
//            public int compare(Phone o1, Phone o2) {
//                return o1.price- o2.price;
//            }
        );

        System.out.println(Arrays.toString(phones));
    }


}
