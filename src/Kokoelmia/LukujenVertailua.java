package Kokoelmia;


import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.stream.IntStream;

//https://www.youtube.com/watch?v=XKu_SEDAykw&t=23s
//Eli olisiko jonkun listan summa=8
public class LukujenVertailua {

    public static void main(String[] args) {
//        int ekaLista[] ={1,2,3,9};
//        int tokaLista[] ={1,2,4,4};
//
//        for (int i = 0; i <ekaLista.length ; i++) {
////            boolean osuma = ekaLista[i]==9;
//            boolean osuma = IntStream.of(ekaLista).anyMatch(x->x==3);
//            System.out.println(ekaLista[i]);
//            System.out.println(osuma);


        int ekalista[]={4,2,6,8,9,3,1};
        int sum=10;
        int arr1[]=new int[sum];


        for(int x=0;x<ekalista.length;x++)
        {
            arr1[ekalista[x]]++;
        }

        for(int y=0;y<ekalista.length;y++)
        {
            if(arr1[sum-ekalista[y]]==1)
            {
                System.out.println(ekalista[y]+"+"+(sum-ekalista[y]));
            }




        }

    }
}
