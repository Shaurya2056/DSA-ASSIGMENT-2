import java.util.Scanner;

public class Q23 {

    static int findMax(int[] arr, int index){
        if (index == arr.length - 1){
            return arr[index];
        }
        int maxOfRest = findMax(arr, index + 1);
        if(arr[index] > maxOfRest){
            return arr[index];
        }
        return maxOfRest;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findMax(arr, 0));

        sc.close();
    }
}