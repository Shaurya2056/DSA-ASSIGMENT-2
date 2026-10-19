import java.util.Scanner;

public class Q9 {

    static long reverse(long n, long reversed) {
        if (n == 0) {
            return reversed;
        }

        long digit = n % 10;
        reversed = reversed * 10 + digit;

        return reverse(n / 10, reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println(reverse(n, 0));

        sc.close();
    }
}