public class AnonymousClass {
    public static void main(String[] args) {

        Person person = new Person(){
            @Override
            public void introduce(){
                System.out.println("익명입니다.");
            }
        };
        person.introduce();
    }


}

class Person {
    public void introduce(){
        System.out.println("사람입니다.");
    }
}
