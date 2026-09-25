import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int answer = Integer.MAX_VALUE;

        // doubled: 2배로 만들 원소의 위치
        for (int doubled = 0; doubled < n; doubled++) {

            // removed: 제거할 원소의 위치
            for (int removed = 0; removed < n; removed++) {
                int score = 0;
                int previous = 0;
                boolean hasPrevious = false;

                for (int i = 0; i < n; i++) {
                    if (i == removed) {
                        continue;
                    }

                    int current = numbers[i];

                    if (i == doubled) {
                        current *= 2;
                    }

                    if (hasPrevious) {
                        score += Math.abs(current - previous);
                    }

                    previous = current;
                    hasPrevious = true;
                }

                answer = Math.min(answer, score);
            }
        }

        System.out.println(answer);
    }
}