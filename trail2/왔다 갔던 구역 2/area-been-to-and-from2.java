import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] lines = new int[2001];
        int now = 1001;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            // Please write your code here.
            if(dir == 'L'){
                while(x-- > 0){
                    lines[--now] += 1;
                }
            }else{
                while(x-- > 0){
                    lines[now++] += 1;
                }
            }
        }

        int count = 0;
        for(int value : lines){
            if(value >= 2) count++;
        }
        System.out.print(count);
    }
}