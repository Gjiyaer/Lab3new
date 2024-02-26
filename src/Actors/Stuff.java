package Actors;

public enum Stuff {
    ZERO_GRAVITY(" управление при невесомости"),
    HEAVY_CONTROL (" управление при тяжести"),
    LUNIT (" лунит"),
    DRAWING (" чертеж"),
    FACTORY (" завод"),
    CASTING (" отливки"),
    FORGINGS (" поковки"),
    STAMPINGS (" штамповки"),
    SCIENTIST_TOWN ( " ученый городок");


    private String title;


    Stuff(String title) {
        this.title=title;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public String toString(){
        return title;
    }
}
