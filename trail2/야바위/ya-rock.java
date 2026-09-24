import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] cupAtPosition = {0, 1, 2, 3};
        int[] score = new int[4];

        for (int round = 0; round < n; round++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int temp = cupAtPosition[a];
            cupAtPosition[a] = cupAtPosition[b];
            cupAtPosition[b] = temp;

            int openedCup = cupAtPosition[c];
            score[openedCup]++;
        }

        int answer = Math.max(
                score[1],
                Math.max(score[2], score[3])
        );

        System.out.println(answer);
    }
}