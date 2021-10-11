package midterm1prep;

public class Die {
    private int roll;

    public Die()
    {
        roll = (int)(Math.random() * 6 + 1); // roll the die the first time
    }

    public int roll() {
        roll = (int)(Math.random() * 6 + 1);
        return roll; // could also make a void function and not return anything
    }

    public int getCurrentRoll() {
        return roll;
    }

    public static void main(String[] args)
    {
        Die d = new Die();
        for (int i = 0; i < 10; i++)
        {
            System.out.println(d.getCurrentRoll());
            d.roll();
        }
    }
}
