public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        for(int i = 0; i <5 ; i++){
            printTenStar(10);
        }

    }

    static void printTenStar(int starCount){
        for(int i = 0; i < starCount; i++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
}