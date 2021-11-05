package inherit1;

import java.awt.*;

public class ParrotDemo {
    public static void main(String[] args) {
        Parrot polly = new Parrot();
        polly.setColor(Color.BLUE);
        polly.setEnergy(3);
        polly.fly();
        polly.sleep();
        polly.sleep();
        polly.sleep();
        polly.fly();

        PetParrot tweety = new PetParrot();
        tweety.setName("Tweety");
        tweety.setEnergy(10);
        tweety.fly();
    }
}
