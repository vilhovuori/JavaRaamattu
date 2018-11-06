package Rekursio;
import java.util.Scanner;

    public class Fibonacci {



        public static void main(String[] args) {
            System.out.println("What number you want");
            Scanner scanner= new Scanner(System.in);
            int number = scanner.nextInt();
            int index=0;
            while(index<=number){
                System.out.println(fibon(index));
                index++;
            }
        }

        public static long fibon(int i){
            if (i==0)return 0;
            if (i<=2)return 1;

            long fibTerm=fibon(i-1)+fibon(i-2);
            return fibTerm;

        }
}
