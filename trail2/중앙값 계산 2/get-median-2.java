import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Please write your code here.
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            if((i + 1) % 2 != 0){
                Arrays.sort(arr, 0, i + 1);
                sb.append(arr[i/2]).append(" ");
            }
        }

        System.out.print(sb.toString());
    }
}