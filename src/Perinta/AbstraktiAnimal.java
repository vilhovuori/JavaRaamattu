package Perinta;


//Kun ei haluta objektia luotavan niin tehdään abstrakti luokka
public abstract class AbstraktiAnimal {

    public abstract void eat();
    public void sleep(){
        System.out.println("Ja syöpi");
    }

}
