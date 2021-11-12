package poly2;

import java.util.ArrayList;

public class MyPets {
    public static void main(String[] args)
    {
        ArrayList<Pet> mypets = new ArrayList<Pet>();

        mypets.add(new Dog("Fido", 2));
        mypets.add(new ShowDog("Lassie", 5));
        mypets.add(new Cat("Snowball", 3));

        //Pet genericPet = new Pet();
        //genericPet.speak();

        for (Pet p : mypets)
        {
            System.out.println(p);
            p.speak();
            // I want p to speak!
            /*if (p instanceof Dog) {
                ((Dog)p).speak();
            }
            else if (p instanceof Cat) {
                ((Cat) p).speak();
            }*/
        }
    }
}
