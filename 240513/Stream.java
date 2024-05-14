import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class StudyStream {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        intList.stream()
                .filter(a -> a % 2 == 0)
                .map(a -> a * 2)
                .forEach(System.out::println);

        List<String> list = Arrays.asList("apple", "orange", "banana");
        String [] strings = new String[] {"apple", "orange", "banana"};
        
        list.stream().filter(a -> a.contains("b")).map(a -> a.toUpperCase()).forEach(System.out::println);
    }
}