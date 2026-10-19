import java.util.Scanner;

public class Q1{

    static void printNumbers(int current, int n){
        if(current>n){
            return;
        }

        if(current > 1){
            System.out.print(" ");
        }

        System.out.print(current);
        printNumbers(current+1, n);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();

        printNumbers(1, n);

        sc.close();
    }
}