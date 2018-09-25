package Kokoelmia;

public class ArrayAlustaAlkava {
    public static void main(String[] args) {

        char res;
        int ctr = 10;
        char[] flames = {'F','L','A','M','E','S'};

        final int n = flames.length;
        for(int z = 0; z < ctr-1; z++)
        {
            res = (flames[z % n]);
            System.out.println(String.valueOf(res));
        }
        for (char h:flames){
            System.out.print(h);
        }
    }

}
