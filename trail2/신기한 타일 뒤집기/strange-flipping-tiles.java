import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] tils = new char[200001];
        int now = 100001;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if(d == 'L'){
                while(x-- > 0){
                    tils[now--] = 'W';
                }
                now++;
            }else{
                while(x-- > 0){
                    tils[now++] = 'B';
                }
                now--;
            }
        }
        int[] result = new int[2]; //W -> 0, B -> 1 인덱스
        for(char color : tils){
            if(color == 'W') result[0] += 1;
            else if(color == 'B') result[1] += 1;
        } 
        System.out.printf("%d %d", result[0], result[1]);
    }
}