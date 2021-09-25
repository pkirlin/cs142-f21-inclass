package oop2;

public class DogTest {
    public static void main(String[] args)
    {
        Dog fido = new Dog("Fido", 3, 40);
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
