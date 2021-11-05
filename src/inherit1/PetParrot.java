package inherit1;

public class PetParrot extends Parrot {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void talk() {
        System.out.println("The parrot is talking!");
        int e = getEnergy();
        setEnergy(e - 1);
    }

}
