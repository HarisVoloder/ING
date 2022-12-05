package com.ing.zoo;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args){
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";

        List<Animal> animalList = new ArrayList<>();
        animalList.add(henk);
        animalList.add(elsa);
        animalList.add(dora);
        animalList.add(wally);
        animalList.add(marty);



        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

         for (String command : commands) {
            if (input.contains(command)) {
                System.out.println("contains command");
                switch (command){
                    case "hello":
                       animalList.forEach(Animal::sayHello);
                        break;
                    case "give meat":
                        wally.eatMeat();
                        break;
                    case "give leaves":
                        elsa.eatLeaves();
                        dora.eatLeaves();
                        marty.eatLeaves();
                        break;
                    case "perform trick":
                        dora.performTrick();
                        wally.performTrick();
                        break;
                    default:
                        System.out.println("Not a case");
                }
            }
        }





       /* if(input.equals(commands[0] + " henk"))
        {
            henk.sayHello();
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }*/
    }
}
