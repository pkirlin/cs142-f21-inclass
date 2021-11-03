package inherit1;

public class ShowDog extends Dog {
    private int numTrophies;

    public int getNumTrophies() {
        return numTrophies;
    }

    public void setNumTrophies(int numTrophies) {
        this.numTrophies = numTrophies;
    }

    public void dance() {
        System.out.println(name + " is dancing!");
    }


}
