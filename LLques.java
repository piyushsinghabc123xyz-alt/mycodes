import java.util.LinkedList;
import java.util.List;

public class LLques {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for(int i=1;i<=50;i++){
            list.add(i);
        }
        System.out.println(list);
        for(int j=0;j<list.size();j++){
            if(list.get(j)>25){
                list.remove(j);
                j--;
            }
        }
        System.out.println(list);
    }
}
