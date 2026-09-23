import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] blocks = new int[N + 1];
        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            for(int now = A; now <= B; now++){
                blocks[now] += 1;
            }
        }

        int result = Integer.MIN_VALUE;
        
        for(int index = 1; index <= N; index++){
            result = Math.max(result, blocks[index]);
        }
        System.out.print(result);
    }
}