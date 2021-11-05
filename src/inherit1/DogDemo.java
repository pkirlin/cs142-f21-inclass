package inherit1;

public class DogDemo {
    public static void main(String[] args) {
        Dog fido = new Dog();
        fido.setName("Fido");
        fido.setAge(2);

        Dog toto = new Dog();
        toto.setName("Toto");
        toto.setAge(3);

        System.out.println(fido);
        System.out.println(toto);

        ShowDog mufasa = new ShowDog();
        mufasa.setName("Mufasa");
        mufasa.setAge(6);
        System.out.println(mufasa);
        mufasa.highfiveACat("Simba");
        mufasa.setMoneyWon(10000);
        System.out.println("Mufasa has won " + mufasa.getMoneyWon());
    }
}
