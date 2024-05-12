import java.util.ArrayList;

public class ArrayListStudy {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("I");

        list.remove("E");


        for (int a = 0; a < list.size(); a++) {
            list.set(a, list.get(a) + a);
        }

        String[] list1 = {"A", "B", "C", "D", "E", "F", "G", "H"};


        list.addFirst("00");
        System.out.println(list.size());
        System.out.println(list1.length);

    }
}
