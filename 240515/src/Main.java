//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(solution("He11oWor1d","lloWorl",2));


    }

        public static String solution (String my_string, String overwrite_string, int s) {
        String answer = "";

        for(int i = 0; i < s; i++) {
            answer += my_string.charAt(i);
        }
        for(int i = 0; i < overwrite_string.length(); i++) {
            answer += overwrite_string.charAt(i);
        }
        for(int i = s + overwrite_string.length(); i < my_string.length(); i++) {
            answer += my_string.charAt(i);
        }

        return answer;


    }
}

