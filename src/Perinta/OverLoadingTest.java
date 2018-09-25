package Perinta;

public class OverLoadingTest {
    public static void main(String[] args) {
        // OIkeanpuoleinen päättää mitä kutsutaan,
        //Vasemman puolella pitää olla kaikki methodit mitä kutsutaan kun abstraktiluokka
        Animal a=new Dog();
        a.eat();
        //Polymorpish et vaihtuu eri objectiin
//        a=new Animal();
//        a=new Cat();

        Animal b=new Animal();
        b.eat();

        Animal c=new Cat();
        c.eat();

    }


}
