import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        makeRactangle(n);
    }

    static void makeRactangle(int size){
        int number = 1;
        for(int r = 0; r < size; r++){
            for(int c = 0; c <size; c++){
                if(number > 9) number = 1;
                System.out.printf("%d ", number++);
            }
            System.out.print('\n');
        }
    }
}