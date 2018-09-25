package Perinta;
//Kun peritään abstraktiluokka niin sen abstraktit pitää täydentää alemmassa luokassa
public class AbstraktiDog extends AbstraktiAnimal{

    @Override
    public void eat() {
        System.out.println("dadaa");
    }
}




//toinen vaihtoehto että jos ei halua tarjota definitioniä niin pitää olla abstrakti luokka


//public abstract class AbstraktiDog extends AbstraktiAnimal{
//
//
//}
