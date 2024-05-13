public class FuntionalInterTest {
    public static void main(String[] args) {
        FuntionalInterface cal1 = (x, y) -> x + y;
        System.out.println(cal1.calculate(4,6));
    }
}
