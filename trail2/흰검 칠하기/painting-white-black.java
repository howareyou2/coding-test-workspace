import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        char[] dir = new char[n];
        int[] whiteCount = new int[200001]; //0좌표 => 100001
        int[] blackCount = new int[200001]; //0좌표 => 100001
        char[] color = new char[200001];
        int now = 100001;

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            dir[i] = sc.next().charAt(0);
            int moveCount = x[i];
            
            if(dir[i] == 'L'){
                while(moveCount-- > 0){
                    color[now] = 'W';
                    whiteCount[now--] += 1;
                }
                now++;
            }else{
                while(moveCount-- > 0){
                    color[now] = 'B';
                    blackCount [now++] += 1;
                }
                now--;
            }
        }

        int[] result = new int[3]; //W -> 0, B ->1, G->2 인덱스
        for(int index = 0; index < whiteCount.length; index++){
            if(whiteCount[index] >= 2 && blackCount[index] >= 2) result[2] += 1;
            else if(color[index] == 'W') result[0] += 1;
            else if(color[index] == 'B') result[1] += 1;
        }
        System.out.printf("%d %d %d", result[0], result[1], result[2]);
        
    }
}