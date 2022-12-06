package com.ing.zoo.models;

import com.ing.zoo.interfaces.Animal;
import com.ing.zoo.interfaces.Carnivores;
import com.ing.zoo.interfaces.Herbivores;

public class Hippo  extends AnimalAttributes implements Animal, Herbivores {

    public Hippo(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        helloText = "splash";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }


}
