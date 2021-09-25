package oop2;

public class Dog {
    public String name;
    public int weight;
    public int age;
    private int energy;

    public Dog()
    {
        name = "";
        weight = 0;
        age = 0;
        energy = 5;
    }

    public Dog(String newName, int newAge, int newWeight)
    {
        name = newName;
        age = newAge;
        weight = newWeight;
        energy = 5;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int newEnergy) {
        if (newEnergy >= 0) {
            energy = newEnergy;
        }
    }

    public void speak()
    {
        System.out.println(name + " says woof woof!");
    }

    public void speak(String whatToSay)
    {
        System.out.println(name + " says " + whatToSay);
    }

    public void playFetch()
    {
        if (energy > 0) {
            System.out.println(name + " is playing fetch!");
            energy--;
        }
        else {
            System.out.println(name + " is too tired.");
        }
    }

    public void playWith(Dog friend)
    {
        System.out.println(name + " plays with " + friend.name);
    }

    public String toString()
    {
        String answer = name + " is " + age + " years old, and has energy=" + energy;
        return answer;
    }

}
