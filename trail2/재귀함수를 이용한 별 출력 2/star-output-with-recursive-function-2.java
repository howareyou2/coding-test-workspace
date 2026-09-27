import java.util.Scanner;
public class Main {
    static StringBuilder sb;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        sb = new StringBuilder();
        printStar(n);
        System.out.print(sb.toString());
    }

    static void printStar(int n){
        if(n == 0) return;

        for(int i = 0; i < n; i++){
            sb.append("*").append(" ");
        }
        sb.append("\n");

        printStar(n - 1);
        for(int i = 0; i < n; i++){
            sb.append("*").append(" ");
        }
        sb.append("\n");
    }
}