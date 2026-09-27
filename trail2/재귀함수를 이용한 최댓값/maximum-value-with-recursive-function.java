import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        System.out.print(check(arr, 0, 1));
    }

    static int check(int[] arr, int target, int index) {
        if (index == arr.length) {
            return arr[target];
        }

        if (arr[target] < arr[index]) {
            target = index;
        }

        return check(arr, target, index + 1);
    }
}