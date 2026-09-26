import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        int colNum = sc.nextInt();
        // Please write your code here.
        makeRactangle(rowNum, colNum);
    }

    static void makeRactangle(int r, int c){
        for(int x = 0; x < r; x++){
            for(int y = 0; y < c; y++){
                System.out.print('1');
            }
            System.out.print('\n');
        }
    }
}