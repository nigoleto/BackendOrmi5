import java.util.ArrayList;
import java.util.Iterator;

public class IteratorStudy {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            list.add(i + "");
        }

        Iterator<String> iter = list.iterator();

        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());

        if(iter.hasNext()) {
            System.out.println(iter.next());
        }

        if(iter.hasNext()) {
            System.out.println(iter.next());
        }

//        iter.prvious();
        else System.out.println("Finished");

        System.out.println(iter);
    }
}
