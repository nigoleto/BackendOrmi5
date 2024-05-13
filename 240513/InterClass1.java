public class InterClass1 {
    public static void main(String[] args) {
        Inter1 test = (a, b) -> (a + b)%2==0?a+b:a+b+1;
        System.out.println(test.inter1(5,5));
    }
}
