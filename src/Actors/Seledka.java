package Actors;

public class Seledka extends Person {
    public Seledka(String name) {
        super(name);
    }
    @Override
    public void action(Person person) {
        System.out.println(getName() + " и " + person.getName() + " отправляются в" + Stuff.SCIENTIST_TOWN);
    }
}
