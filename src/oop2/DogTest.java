package oop2;

public class DogTest {
    public static void main(String[] args)
    {
        Dog[] dogs = new Dog[3];
        Dog fido = new Dog("Fido", 3, 40);
        dogs[0] = fido;
        fido.age++;
        dogs[0].age++;
        System.out.println(fido);
        System.out.println(dogs[0]);
        dogs[0].playFetch();
        dogs[0].playWith(fido);
        dogs[1] = new Dog("Toto", 6, 10);
        dogs[0].playWith(dogs[1]);
        System.out.println(dogs[2]);
        System.out.println("Number of dogs = " + Dog.numberOfDogs);

        for (int i = 0; i < dogs.length; i++)
        {
            System.out.println("Here is a dog: " + dogs[i].age);
            dogs[i].playWith(dogs[i+1]);
        }

        Dog someDog = null;
        //someDog.playFetch();

        //fido.name = "Fido";
        //fido.age = 3;
        //fido.weight = 40;
        Dog lassie = new Dog("Lassie", 4, 60);
        //lassie.name = "Lassie";
        //lassie.age = 4;
        //lassie.weight = 60;

        System.out.println(fido);
        System.out.println(lassie);
        fido.playFetch();
        fido.playFetch();
        fido.playFetch();
        fido.playFetch();
        fido.playFetch();
        fido.playFetch();
        System.out.println(fido);
        fido.playWith(lassie);

        Dog dog3 = fido;
        System.out.println(dog3);
        dog3 = lassie;
        System.out.println(dog3);
        dog3.age++;
        System.out.println(dog3);
        System.out.println(lassie);

        fido.speak();
        lassie.speak("blah blah");


    }
}
