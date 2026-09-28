import java.util.*;
public class Main {
    static class Student{
        int number;
        int height;
        int weight;

        Student(int n, int h, int w){
            this.number = n;
            this.height = h;
            this.weight = w;
        }

        @Override
        public String toString(){
            return height + " " + weight + " " + number + "\n";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        int[] weight = new int[n];
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
            students[i] = new Student(i + 1, height[i], weight[i]);
        }
        // Please write your code here.
        Arrays.sort(students, (a, b)->{
            if(a.height == b.height) {
                if(a.weight == b.weight) return a.number - b.number;
                return b.weight - a.weight;
            }
            return b.height - a.height;
        });

        StringBuilder sb = new StringBuilder();
        for(Student s: students){
            sb.append(s);
        }

        System.out.print(sb.toString());
    }
}