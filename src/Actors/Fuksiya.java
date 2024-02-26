package Actors;

public class Fuksiya extends Person{
    public Fuksiya(String name) {
        super(name);
    }
    @Override
    public void action(Person person) {
        System.out.println(getName() + " и " + person.getName() + " закончили работу над" + Stuff.DRAWING);

    }
}
