import java.util.Scanner;

public class Q19 {

    static int countOccurrences(String s, char c, int index){
        if (index == s.length()){
            return 0;
        }

        int count = 0;

        if (s.charAt(index)==c){
            count = 1;
        }

        return count + countOccurrences(s, c, index + 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s =sc.nextLine();
        char c =sc.next().charAt(0);

        System.out.println(countOccurrences(s, c, 0));

        sc.close();
    }
}