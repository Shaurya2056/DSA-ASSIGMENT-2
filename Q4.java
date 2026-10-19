import java.util.Scanner;

public class Q4 {

    static void printOdd(int current, int n) {
        if (current > n) {
            return;
        }

        if (current > 1) {
            System.out.print(" ");
        }

        System.out.print(current);
        printOdd(current + 2, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printOdd(1, n);

        sc.close();
    }
}