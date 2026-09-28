import java.util.*;
public class Main {
    public static final int MAX_N = 1000;

    public static int[] h = new int[MAX_N];
    public static int[] w = new int[MAX_N];

    static class Student implements Comparable<Student>{
        int height;
        int weight;
        int number;

        Student(int h, int w, int n){
            this.height = h;
            this.weight = w;
            this.number = n;
        }

        @Override
        public int compareTo(Student other){
            if(this.height == other.height) return other.weight - this.weight;
            return this.height - other.height;
        }

        @Override
        public String toString(){
            return height + " " + weight + " " + number + "\n";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            w[i] = sc.nextInt();
            students[i] = new Student(h[i], w[i], i + 1);
        }
        // Please write your code here.
        Arrays.sort(students);
        StringBuilder sb = new StringBuilder();
        for(Student s: students){
            sb.append(s);
        }

        System.out.print(sb.toString());
    }
}
