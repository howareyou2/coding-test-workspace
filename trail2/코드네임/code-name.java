import java.util.Scanner;
import java.util.*;

class User implements Comparable<User>{
    char codeName;
    int score;

    @Override
    public int compareTo(User other){
        return Integer.compare(this.score, other.score);
    }

    @Override
    public String toString(){
        return codeName + " " + score;
    }
}

public class Main {
    public static final int MAX_N = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User[] users = new User[MAX_N];
        for (int i = 0; i < MAX_N; i++) {
            users[i] = new User();
            users[i].codeName = sc.next().charAt(0);
            users[i].score = sc.nextInt();
        }

        // Please write your code here.

        Arrays.sort(users);
        System.out.print(users[0]);
    }
}
