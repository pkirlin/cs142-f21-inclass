package oop2;

public class DogDemo {
    public static void main(String[] args)
    {
        Dog[] dogs = new Dog[3]; // makes space for an array of 3 dogs
        Dog fido = new Dog("Fido", 3, 30);
        dogs[0] = fido;
        dogs[1] = new Dog("Toto",7, 10);
        fido.age++;

        dogs[0].playFetch(); // == fido.playFetch();
        dogs[1].playWith(dogs[1]);

        for (int i = 0; i < dogs.length; i++)
        {
            System.out.println(dogs[i]);
            //System.out.println(dogs[i].age);
        }

        System.out.println(fido);
        System.out.println(dogs[0]);
        System.out.println(dogs[2]);
        System.out.println("this is the number of dogs: " + Dog.numberOfDogs);
        //System.out.println(dogs[3]);



        //fido.age = 3;
        //fido.name = "Fido";
        //fido.weight = 30;
        Dog lassie = new Dog("Lassie", 5, 70);
        //lassie.age = 5;
        //lassie.weight = 70;
        //lassie.name = "Lassie";
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
        lassie.playWith(fido);


        Dog dog3 = fido;
        dog3.age++;
        System.out.println(dog3);
        System.out.println(fido);
        dog3 = lassie;
        System.out.println(dog3);

        fido.speak();
        lassie.speak();
        lassie.speak("bark bark");
        dog3.speak("Supercalifragilisticexpoadfsdf");
        lassie.speak("nothing");
    }
}
