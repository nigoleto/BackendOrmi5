public class Generic {
    public static void main(String[] args) {
        printPerson("John Doe");
        printPerson(72);
    }

    public static <t> void printPerson(t person){
        System.out.println(person);
    }
}
