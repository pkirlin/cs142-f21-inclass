package oop2;

public class Dog {
    public String name;
    public int weight;
    public int age;

    public void speak()
    {
        System.out.println(name + " says woof woof!");
    }

    public void speak(String whatToSay)
    {
        System.out.println(name + " says " + whatToSay);
    }

    public String toString()
    {
        String answer = name + " is " + age + " years old!!!!";
        return answer;
    }

}
