package com.ing.zoo;

public class Lion implements Animal, Carnivores {
    public String name;
    public String helloText;
    public String eatText;

    public Lion()
    {
    }

    @Override
    public void sayHello() {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }


}
