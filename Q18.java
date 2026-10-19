import java.util.Scanner;

public class Q18 {

    static long binaryToDecimal(String s, int index){
        if (index < 0){
            return 0;
        }

        int digit = s.charAt(index) - '0';

        return binaryToDecimal(s, index - 1) * 2 + digit;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(binaryToDecimal(s, s.length() - 1));

        sc.close();
    }
}