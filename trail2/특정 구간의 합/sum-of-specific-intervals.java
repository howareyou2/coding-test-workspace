import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(i == 0) dp[0] = arr[0];
            if(i != 0){
                dp[i] = dp[i - 1] + arr[i];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            // Please write your code here.
            sb.append(dp[a2 - 1] - dp[a1 - 1] + arr[a1 - 1]).append("\n");
        }

        System.out.print(sb.toString());
    }
}