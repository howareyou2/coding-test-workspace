import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }
        // Please write your code here.
        int[] line = new int[201];

        for (int i = 0; i < n; i++) {
            for(int x = x1[i] + 100; x < x2[i] + 100; x++){
                line[x] += 1;
            }
        }

        int result = Integer.MIN_VALUE;
        for(int length : line){
            result = Math.max(length, result);
        }

        System.out.print(result);

    }
}