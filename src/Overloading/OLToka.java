package Overloading;

public class OLToka {

    public static void main(String[] args) {

        OverloadingEka OverloadingEkaObject = new OverloadingEka();
        OverloadingEka OverloadingEkaObject2 = new OverloadingEka(5);
        OverloadingEka OverloadingEkaObject3 = new OverloadingEka(6,13);
        OverloadingEka OverloadingEkaObject4 = new OverloadingEka(5,13,55);

        System.out.printf("%s\n", OverloadingEkaObject.toMilitary());
        System.out.printf("%s\n", OverloadingEkaObject2.toMilitary());
        System.out.printf("%s\n", OverloadingEkaObject3.toMilitary());
        System.out.printf("%s\n", OverloadingEkaObject4.toMilitary());
    }

    }


