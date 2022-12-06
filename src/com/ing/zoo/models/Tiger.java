package com.ing.zoo.models;

import com.ing.zoo.interfaces.Animal;
import com.ing.zoo.interfaces.Carnivores;
import com.ing.zoo.interfaces.TrickAnimals;

import java.util.Random;

public class Tiger extends AnimalAttributes implements Animal, Carnivores, TrickAnimals {
    public String trick;

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        helloText = "rraaarww";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }


}
