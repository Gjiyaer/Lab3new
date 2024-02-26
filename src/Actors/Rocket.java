package Actors;

public class Rocket extends Person{
    public Rocket(String name) {
        super(name);
    }
    @Override
    public void action(Person person) {

    }
    public void controlModes() {
        System.out.println(getName() + " должна иметь два вида управления:" + Stuff.HEAVY_CONTROL + " и " + Stuff.ZERO_GRAVITY);
    }
    public void upgrade(Stuff ... stufs) {
        System.out.println(" требуется сделать для " + getName() + " следующие элементы: ");
        for (int i=0; i<stufs.length; i++) {
            System.out.println(stufs[i]);
        }
    }
}
