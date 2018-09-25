package Ehtolauseet;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int value = 0;

        do {
            System.out.println("Numero");
            value = scanner.nextInt();

        } while(value !=5);

        System.out.println("Tuli 5");
    }

}
