package LoogisetOperaattorit;

public class JaTai {

    // ja &&
    // tai ||

    public static void main(String[] args) {
        System.out.println("Onkohan luku väliltä 5-10: ");
        int luku = 7;

        if (luku > 4 && luku < 11) {
            System.out.println("On! :)");
        } else {
            System.out.println("Ei ollut :(");
        }
    }
}
