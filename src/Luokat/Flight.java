package Luokat;
//Class initialization Blocks
public class Flight {

    private int passangers, flightNumber, seats = 150;
    private char flightClass;
    private boolean[] isSeatAvailable;
    {
        isSeatAvailable = new boolean[seats];
        for (int i = 0; i < seats; i++)
            isSeatAvailable[i] = true;
    }
    public Flight() {
    }
    public Flight( int flightNumber){
        this.flightNumber = flightNumber;
    }
    public Flight( char flightClass){
        this.flightClass = flightClass;
    }
}

    //-----------------vs---------------------------------
//    public Flight(){
//        isSeatAvailable = new boolean[seats];
//        for (int i = 0; i < seats; i++)
//            isSeatAvailable[i] = true;
//    }
//    public Flight( int flightNumber){
//        this();
//        this.flightNumber = flightNumber;
//    }
//    public Flight( char flightClass){
//        this();
//        this.flightClass = flightClass;
//    }
//
//
//}

