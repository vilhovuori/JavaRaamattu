package Ehtolauseet;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Tekstiä");
        String text = input.nextLine();

        switch (text){
            case "start":
                System.out.println("It started");
                break;
            case "stop":
                System.out.println("it stopped..");
                break;

            default:
                System.out.println("Ei tuttu käsky");
        }

    }
}
