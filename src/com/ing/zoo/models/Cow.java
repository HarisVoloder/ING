package com.ing.zoo.models;

import com.ing.zoo.interfaces.Animal;
import com.ing.zoo.interfaces.Carnivores;
import com.ing.zoo.interfaces.Herbivores;

public class Cow extends AnimalAttributes implements Animal, Herbivores {
    public Cow(String name) {this.name = name;}

    @Override
    public void sayHello() {
        helloText = "mmmooeoeeeeeeee";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "cow eats plants";
        System.out.println(eatText);
    }
}
