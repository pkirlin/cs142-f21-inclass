package oop2;

public class Dog {
    public String name;
    public int weight;
    public int age;

    public String toString()
    {
        String answer = name + " is " + age + " years old.";
        return answer;
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

}
