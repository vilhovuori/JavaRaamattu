package Lukija;

import java.util.Random;

public class Randomi {


    public static void main(String[] args) {
        Random noppa = new Random();
        int numero;

//        for (int i = 1; i <5 ; i++) {
//            numero=noppa.nextInt(6);
//        }

        for (int counter=1; counter<10; counter++ ){
            numero=noppa.nextInt(5)+1;
            System.out.println(numero);
        }

    }

}
