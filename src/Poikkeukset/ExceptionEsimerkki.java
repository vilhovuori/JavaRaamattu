package Poikkeukset;

import jdk.nashorn.internal.runtime.ECMAException;

public class ExceptionEsimerkki {

    public static void main(String[] args) {

      int[] arr=new int[5];
      arr[0]=18;
      try{
        System.out.println("Element at the location 9th"+arr[9]);
    } catch (Exception e){
          System.out.println("Execption has been handled");
      }
      finally {
          System.out.println("Finally block: dadaadad");
      }
        System.out.println("Selvisit tänne asti");
    }
}
