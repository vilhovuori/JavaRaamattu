package LoogisetOperaattorit;

import sun.rmi.runtime.Log;

public class JakojaannosTesti {

    public static void main(String[] args) {

        for (int i = 1; i <100 ; i++) {
            if (i%3==0){
                System.out.println(i);
            } if (i%5==0){
                if (i%3==0) {
                    
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
