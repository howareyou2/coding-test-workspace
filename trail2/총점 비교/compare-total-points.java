import java.util.*;
public class Main {
    static class Student{
        String name;
        int score1;
        int score2;
        int score3;

        Student(String n, int s1, int s2, int s3){
            this.name = n;
            this.score1 = s1;
            this.score2 = s2;
            this.score3 = s3;
        }

        int totalScore(){
            return score1 + score2 + score3;
        }

        @Override
        public String toString(){
            return name + " " + score1 + " " + score2 + " " + score3 + "\n";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();
            students[i] = new Student(name, score1, score2, score3);
        }
        // Please write your code here.

        Arrays.sort(students, (a, b) -> (a.totalScore() - b.totalScore()));
        StringBuilder sb = new StringBuilder();
        for(Student s : students){
            sb.append(s);
        }
        
        System.out.print(sb.toString());
    }
}