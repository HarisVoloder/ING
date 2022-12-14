package com.ing.zoo.models;

import com.ing.zoo.interfaces.Animal;
import com.ing.zoo.interfaces.Carnivores;
import com.ing.zoo.interfaces.Herbivores;
import com.ing.zoo.interfaces.TrickAnimals;

import java.util.Random;

public class Pig extends AnimalAttributes implements Animal, Herbivores, Carnivores, TrickAnimals {
    public String trick;

    public Pig(String name) {
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
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }


}
