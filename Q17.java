import java.util.Scanner;

public class Q17 {

    static void decimalToBinary(long n){
        if (n < 2){
            System.out.print(n);
            return;
        }

        decimalToBinary(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        decimalToBinary(n);

        sc.close();
    }
}