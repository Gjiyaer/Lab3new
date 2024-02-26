package Actors;

public class Scientists extends Person {
    public Scientists(String name) {
        super(name);
    }
    @Override
    public void action(Person person) {
        System.out.println(getName() + " забрали" + Stuff.DRAWING + " " + person.getName() + " и отправили на " + Stuff.FACTORY);
    }
}
