package inherit1;

public class ShowDog extends Dog {
    private int moneyWon;

    public int getMoneyWon() {
        return moneyWon;
    }

    public void setMoneyWon(int moneyWon) {
        this.moneyWon = moneyWon;
    }

    public void highfiveACat(String nameOfCat) {
        System.out.println(name + " high fives " + nameOfCat);
    }
}
