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

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

         for (String command : commands) {
            if (input.contains(command)) {
                System.out.println("contains command");
                switch (command){
                    case "hello":
                        henk.sayHello();
                        break;
                    case "give meat":
                        henk.eatMeat();
                        break;
                    case "give leaves":
                        elsa.eatLeaves();
                        break;
                    case "perform trick":
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
