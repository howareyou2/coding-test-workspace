import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printWords(n);
    }

    static void printWords(int totalLoop){
        while(totalLoop-- > 0){
            System.out.print("12345^&*()_\n");
        }
    }
}