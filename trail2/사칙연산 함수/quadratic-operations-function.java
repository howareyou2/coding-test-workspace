import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.
        String result; 
        if( o == '+') result = sum(a,c);
        else if( o == '-') result = minus(a, c);
        else if( o == '/') result = divide(a, c);
        else if( o == '*') result = multiple(a, c);
        else result = "False";
        System.out.print(result);
    }

    static String sum(int x, int y){
        return x + " + " + y + " = " + (x + y);
    }

    static String minus(int x, int y){
        return x + " - " + y + " = " + (x - y);
    }

    static String divide(int x, int y){
        return x + " / " + y + " = " + (x / y);
    }

    static String multiple(int x, int y){
        return x + " * " + y + " = " + (x * y);
    }
}
