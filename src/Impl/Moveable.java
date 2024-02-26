package Impl;

import Actors.Person;

public interface Moveable {
    void action(Person person);  //метод, вызывающийся у всех участников при каком либо действии
}
