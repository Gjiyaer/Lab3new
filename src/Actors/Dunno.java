package Actors;

import Impl.Actionable;

import javax.swing.*;

public class Dunno extends Person implements Actionable {
    public Dunno(String name) {
        super(name);
    }
    @Override
    public void action(Person person) {
        System.out.println(getName() + " делает предложение по улучшению " + person.getName());
    }

    @Override
    public void search(Stuff stuff) {
        System.out.println(getName() + " надеется найти" + stuff);
    }

    public void friendsSearching(Stuff stuff) {
        System.out.println(getName() + " хочет найти друзей, используя"+ stuff);
    }
}
