package com.ing.zoo.models;

import com.ing.zoo.interfaces.Animal;
import com.ing.zoo.interfaces.Carnivores;
import com.ing.zoo.interfaces.Herbivores;

public class Bear extends AnimalAttributes implements Animal, Carnivores {
    public Bear(String name) {this.name = name;}

    @Override
    public void sayHello() {
        helloText = "growwwlllll";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "bear eats meat";
        System.out.println(eatText);
    }
}
