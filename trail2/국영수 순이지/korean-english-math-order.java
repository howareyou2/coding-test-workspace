import java.util.*;
public class Main {
    static class Student implements Comparable<Student>{
        String name;
        int kScore;
        int eScore;
        int mScore;

        Student(String n, int k, int e, int m){
            this.name = n;
            this.kScore = k;
            this.eScore = e;
            this.mScore = m;
        }

        @Override
        public int compareTo(Student other){
            if(this.kScore == other.kScore) {
                if(this.eScore == other.eScore) return (this.mScore - other.mScore) * (-1);

                return (this.eScore - other.eScore) * (-1); 
            }
            return (this.kScore - other.kScore) * (-1);
        }

        @Override
        public String toString(){
            return name + " " + kScore + " " + eScore + " " + mScore + "\n";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] korean = new int[n];
        int[] english = new int[n];
        int[] math = new int[n];
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            korean[i] = sc.nextInt();
            english[i] = sc.nextInt();
            math[i] = sc.nextInt();
            students[i] = new Student(names[i], korean[i], english[i], math[i]);
        }
        // Please write your code here.
        Arrays.sort(students);
        StringBuilder sb = new StringBuilder();

        for(Student s : students){
            sb.append(s);
        }

        System.out.print(sb.toString());

    }
}