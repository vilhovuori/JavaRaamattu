package Kokoelmia;

public class ArrayRakennnus {

    public static void main(String[] args) {

        int summa=0;
        int lista [] = {1,2,45,7,9};
//        System.out.println(lista[2]);


        //Sanoo että 10 arvoa talletetaan tähän array
        int toinenLista[]=new int[10];

        toinenLista [0]=87;
        toinenLista [1]=827;
        toinenLista [9]=4;

//        System.out.println(toinenLista[9]);

//        System.out.println("Index\tValue");
        for (int i = 0; i <lista.length ; i++) {
//            System.out.println(i + "\t\t" + lista[i]);
        }
        for (int i = 0; i <lista.length ; i++) {
            summa+=lista[i];

        }
//        System.out.println(summa);

        change(lista);
        for (int y:lista)
            System.out.println(y);

    }

    public static void change (int x[]){
        for(int counter=0;counter<x.length;counter++)
            x[counter]+=5;
    }
}
