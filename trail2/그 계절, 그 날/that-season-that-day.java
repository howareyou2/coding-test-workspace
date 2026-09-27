import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        int[] days = {
            0,
            31, 28, 31, 30,
            31, 30, 31, 31,
            30, 31, 30, 31
        };

        System.out.print(checkWeather(y, m, d, days));
    }

    static String checkWeather(int y, int m, int d, int[] days){
        if(checkYear(y)) days[2] = 29;

        if(m > 2 && m < 6 && days[m] >= d && d > 0) return "Spring";

        if(m > 5 && m < 9 && days[m] >= d && d > 0) return "Summer";

        if(m > 8 && m < 12 && days[m] >= d && d > 0) return "Fall";

        if(m > 0 && (m < 3 || m ==12) && days[m] >= d && d > 0) return "Winter";
        
        return "-1";
    }

    static boolean checkYear(int y){
        if(y % 100 == 0){
            if(y % 400 == 0) return true;
            return false;
        }
        
        if(y % 4 == 0) return true;
        return false;
    }
}