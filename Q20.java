import java.util.Scanner;

public class Q20 {

    static String removeChar(String s, char c, int index){
        if (index == s.length()) {
            return "";
        }

        char current = s.charAt(index);

        if (current == c){
            return removeChar(s, c, index + 1);
        }

        return current + removeChar(s, c, index + 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char c = sc.next().charAt(0);

        System.out.println(removeChar(s, c, 0));

        sc.close();
    }
}