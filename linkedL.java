import java.util.List;
import java.util.LinkedList;
public class linkedL {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);

        for(int i=0;i<list.size();i++){
            int x= list.get(i);
            if(x==7){
                System.out.println("7 is present at index:"+i);
                break;
            }
        }
    }
}
