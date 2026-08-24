import java.util.ArrayList;
import java.util.List;
import school.Student;
import java.util.Collections;

public class hashsett {
    public static void main(String[]args){
        List<Student> list = new ArrayList<Student>();

        list.add(new Student("Piyush", 42));
        list.add(new Student("Ram", 34));
        list.add(new Student("Raj", 23));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
