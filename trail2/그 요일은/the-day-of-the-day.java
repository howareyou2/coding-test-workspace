import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();

        int[] days = {
            0,
            31, 29, 31, 30,
            31, 30, 31, 31,
            30, 31, 30, 31
        };

        int previousDay = 0;
        int nowDay = 0;

        for (int month = 1; month < m1; month++) {
            previousDay += days[month];
        }
        previousDay += d1;

        for (int month = 1; month < m2; month++) {
            nowDay += days[month];
        }
        nowDay += d2;

        String[] dayOfTheWeek = {
            "Mon", "Tue", "Wed",
            "Thu", "Fri", "Sat", "Sun"
        };

        int dayOfTheWeekIndex = 0;

        for (int i = 0; i < dayOfTheWeek.length; i++) {
            if (A.equals(dayOfTheWeek[i])) {
                dayOfTheWeekIndex = i;
                break; 
            }
        }

        int totalDays = nowDay - previousDay + 1;

        int count = totalDays / 7;
        int remainderDay = totalDays % 7;

        if (dayOfTheWeekIndex < remainderDay) {
            count++;
        }

        System.out.print(count);
    }
}