package Luokat;

import java.util.function.Function;

public class LuokkienLainaus {


    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.name = "Fluffy";
        animal1.breed = "Dog";
        animal1.age = 7;
        animal1.colour = "Brown";

//        System.out.println(animal1.name);
        animal1.describe();
//        System.out.println(animal1.calculaterBirthYear(animal1.age));
        System.out.println(animal1.calculaterBirthYear());
        System.out.println(animal1.getName());

        Animal animal2 = new Animal();
        animal2.name="Duffy";
        animal2.breed = "cat";
        animal2.age=4;
        animal2.colour = "blue";
    }
}

class Animal{
    String name;
    String breed;
    int age;
    String colour;

    void describe(){
        System.out.println("Hello my name is " + name);
    }

//    int calculaterBirthYear(int age){
//        return 2016-age;
//    }
int calculaterBirthYear(){
    return 2016-age;
}

String getName(){
        return name;
}


}
