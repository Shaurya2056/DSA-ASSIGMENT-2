import java.util.Scanner;

public class Q26 {

    static int binarySearchFirst(int[] arr, int x, int left, int right){
        if (left > right){
            return -1;
        }
        int mid = left + (right - left) / 2;
        if(arr[mid] == x){
            int earlier = binarySearchFirst(arr, x, left, mid - 1);
            if(earlier != -1){
                return earlier;
            }
            return mid;
        }

        if (arr[mid]< x){
            return binarySearchFirst(arr, x, mid + 1, right);
        }
        return binarySearchFirst(arr, x, left, mid - 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(binarySearchFirst(arr, x, 0, n - 1));

        sc.close();
    }
}
