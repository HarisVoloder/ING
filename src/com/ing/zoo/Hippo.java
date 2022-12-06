package com.ing.zoo;

public class Hippo implements Animal, Herbivores {
    public String name;
    public String helloText;
    public String eatText;

    public Hippo()
    {
    }

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
