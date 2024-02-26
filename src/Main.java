import Actors.*;

public class Main {

    public static void main(String[] args) {
        Dunno dunno = new Dunno("Знайка");
        Rocket rocket = new Rocket("Ракета");
        Fuksiya fuksiya = new Fuksiya("Фуксия");
        Seledka seledka = new Seledka("Селедочка");
        Scientists scientists = new Scientists("Ученые");

        dunno.action(rocket);
        rocket.controlModes();
        dunno.search(Stuff.LUNIT);
        dunno.friendsSearching(Stuff.LUNIT);
        fuksiya.action(seledka);
        seledka.action(fuksiya);
        scientists.action(rocket);
        rocket.upgrade(Stuff.CASTING, Stuff.FORGINGS, Stuff.STAMPINGS);
    }
}
