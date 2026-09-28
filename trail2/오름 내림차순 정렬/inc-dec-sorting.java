import java.util.Scanner;
import java.util.*;

public class Main {
    static StringBuilder sb;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        sb = new StringBuilder();
        Arrays.sort(arr);
        for(int num : arr){
            sb.append(num).append(" ");
        }
        sb.append("\n");

        for(int i = arr.length - 1; i >= 0; i--){
            sb.append(arr[i]).append(" ");
        }
        
        System.out.print(sb.toString());
    }
}