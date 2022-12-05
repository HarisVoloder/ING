package com.ing.zoo;

import java.util.Random;

public class Zebra implements Animal, Herbivores {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Zebra()
    {
    }

    @Override
    public void sayHello() {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }


}
