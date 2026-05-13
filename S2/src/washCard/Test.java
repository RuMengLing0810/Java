package washCard;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static final String SUITS[]={"♠", "♥", "♣", "♦"};
    public static final int RANKS[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
    //初始化
    public static List<Card> initCards(){
        List<Card> cardList=new ArrayList<>();
        for (int i = 0; i < SUITS.length; i++) {
            for (int j = 0; j < RANKS.length; j++) {
                Card card=new Card(SUITS[i],RANKS[j]);
                cardList.add(card);
            }
        }
        return cardList;
    }
//交换
    public static void swap(List<Card> cardList,int i,int j){
       Card t=cardList.get(i);
       cardList.set(i,cardList.get(j));
       cardList.set(j,t);
    }
//洗牌
    public static void shuffle(List<Card> cardList){
        Random random=new Random(20032133);
        for (int i = cardList.size()-1; i > 0; i--) {
            int index = random.nextInt(i);
            swap(cardList, i, index);
        }
    }


    public static void main(String[] args) {
        List<Card> cardList = initCards();

        System.out.println("原始牌：");
        System.out.println(cardList);

        shuffle(cardList);

        System.out.println("洗牌后：");
        System.out.println(cardList);

        // 三个玩家
        List<Card> p1 = new ArrayList<>();
        List<Card> p2 = new ArrayList<>();
        List<Card> p3 = new ArrayList<>();

        // 发牌
        for (int i = 0; i < 5; i++) {

            p1.add(cardList.remove(0));

            p2.add(cardList.remove(0));

            p3.add(cardList.remove(0));
        }

        System.out.println("玩家1：" + p1);

        System.out.println("玩家2：" + p2);

        System.out.println("玩家3：" + p3);

        System.out.println("剩余牌：" + cardList);
    }
}
