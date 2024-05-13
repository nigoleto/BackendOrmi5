public class Study3 {
    public static void main(String[] args) {
        Student study = (a , b) -> a + ": " + b + "세";
        System.out.println(study.stuIntro("김철수", 23));
    }
}

interface Student {
    String stuIntro (String name, int age);
}
