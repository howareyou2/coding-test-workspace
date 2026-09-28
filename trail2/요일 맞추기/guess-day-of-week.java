import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int previousDay = 0;
        int nowDay = 0;
        for(int m = 1; m < m1; m++){
            previousDay += days[m];
        }
        previousDay += d1;

        for(int m = 1; m < m2; m++){
            nowDay += days[m];
        }
        nowDay += d2;

        String[] dayOfTheWeek= {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int differentDay = nowDay - previousDay;
        if(differentDay < 0){
            System.out.print(dayOfTheWeek[(7 + differentDay % 7) % 7]);
        }else{
            System.out.print(dayOfTheWeek[differentDay % 7]);
        }
    }
}