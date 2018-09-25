package Kokoelmia;

import java.util.Random;

public class NopanTulokset {

    public static void main(String[] args) {
        Random rand = new Random();
        int freq[]=new int [7];

        for (int i = 0; i <100 ; i++) {
            ++freq[1+rand.nextInt(6)];
        }
        System.out.println("Face\tFrequency");

        for (int face = 1; face <freq.length ; face++) {
            System.out.println(face+"\t\t"+freq[face]);
        }
    }
}
