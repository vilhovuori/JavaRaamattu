package Mapping;

import java.util.HashMap;
import java.util.Scanner;

public class HashmapMorse {
    public static void main(String[] args) {

        HashMap<String, String> sanasto= new HashMap<>();
        sanasto.put(" "," " );
        sanasto.put("A",".-" );
        sanasto.put("B","-..." );
        sanasto.put("C","-.-." );
        sanasto.put("D","-.." );
        sanasto.put("E","." );
        sanasto.put("F","..-." );
        sanasto.put("G","--." );
        sanasto.put("H","...." );
        sanasto.put("I",".." );
        sanasto.put("J",".---" );
        sanasto.put("K","-.-" );
        sanasto.put("L",".-.." );
        sanasto.put("M","--" );
        sanasto.put("N","-." );
        sanasto.put("O","---" );
        sanasto.put("P",".--." );
        sanasto.put("Q","--.-" );
        sanasto.put("R",".-." );
        sanasto.put("S","..." );
        sanasto.put("T","-" );
        sanasto.put("U","..-" );
        sanasto.put("V","...-" );
        sanasto.put("W",".--" );
        sanasto.put("X","-..-" );
        sanasto.put("Y","-.--" );
        sanasto.put("Z","--.." );


        sanasto.put("1",".----" );
        sanasto.put("2","..---" );
        sanasto.put("3","...--" );
        sanasto.put("4","....-" );
        sanasto.put("5","....." );
        sanasto.put("6","-...." );
        sanasto.put("7","--..." );
        sanasto.put("8","---.." );
        sanasto.put("9","----." );
        sanasto.put("0","-----" );

        System.out.println("Syötä haluamasi sana");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        System.out.println("text: "+text);

        String morse="";

        for (char c: text.toCharArray()){

            morse+=sanasto.get((c+ "").toUpperCase())+" ";
        }
        System.out.println("morse: "+morse);
    }
}
