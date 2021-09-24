package oop2;

public class Dog {
    public String name;
    public int weight;
    public int age;
    private int energy;

    public Dog()
    {
        age = 0;
        weight = 0;
        name = "";
        energy = 5;
    }

    public Dog(String newName, int newAge, int newWeight)
    {
        name = newName;
        age = newAge;
        weight = newWeight;
        energy = 5;
    }

    public int getEnergy()
    {
        return energy;
    }

    public void setEnergy(int newEnergy)
    {
        if (newEnergy >= 0) {
            energy = newEnergy;
        }
    }

    public String toString()
    {
        String answer = name + " is " + age + " years old, and has energy= " + energy;
        return answer;
    }

    public void playFetch()
    {
        if (energy > 0) {
            System.out.println(name + " is playing fetch!");
            energy--;
        }
    }

    public void speak()
    {
        //System.out.println(name + " says woof woof");
        if (weight < 20) {
            System.out.println(name + " says yip yip");
        } else if (weight < 60) {
            System.out.println(name + " says bark bark");
        } else {
            System.out.println(name + " says woof woof");
        }
    }

    public void speak(String whatToSay)
    {
        System.out.println(name + " says " + whatToSay);
    }

    public void playWith(Dog friend)
    {
        System.out.println(name + " is playing with " + friend.name);
    }

}
