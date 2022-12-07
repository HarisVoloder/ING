package com.ing.zoo;

import com.ing.zoo.interfaces.Animal;
import com.ing.zoo.interfaces.Carnivores;
import com.ing.zoo.interfaces.Herbivores;
import com.ing.zoo.interfaces.TrickAnimals;
import com.ing.zoo.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Zoo {

    public static void main(String[] args) {
        final int HELLO_COMMAND = 0;
        final int GIVE_LEAVES = 1;
        final int GIVE_MEAT = 2;
        final int PERFORM_TRICK = 3;

        String[] commands = new String[4];
        commands[HELLO_COMMAND] = "hello";
        commands[GIVE_LEAVES] = "give leaves";
        commands[GIVE_MEAT] = "give meat";
        commands[PERFORM_TRICK] = "perform trick";

        Lion henk = new Lion("henk");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora");
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");
        Cow piet = new Cow("piet");
        Bear peter = new Bear("peter");

        var animalList = new ArrayList<Animal>() {{
            add(henk);
            add(elsa);
            add(dora);
            add(wally);
            add(marty);
            add(piet);
            add(peter);
        }};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine().trim();

        if (input.matches("^hello\s+[a-zA-Z]+$")) {
            String name = input.split("\s+")[1];

            switch (name) {
                case "henk" -> henk.sayHello();
                case "elsa" -> elsa.sayHello();
                case "dora" -> dora.sayHello();
                case "wally" -> wally.sayHello();
                case "marty" -> marty.sayHello();
                case "piet" -> piet.sayHello();
                case "peter" -> peter.sayHello();
            }
        } else
            switch (List.of(commands).indexOf(input)) {
                case HELLO_COMMAND -> animalList.forEach(Animal::sayHello);
                case GIVE_MEAT -> getStreamSubsetOf(animalList, Carnivores.class).forEach(Carnivores::eatMeat);
                case GIVE_LEAVES -> getStreamSubsetOf(animalList, Herbivores.class)
                        .forEach(Herbivores::eatLeaves);
                case PERFORM_TRICK -> getStreamSubsetOf(animalList, TrickAnimals.class)
                        .forEach(TrickAnimals::performTrick);
                default -> System.out.println("Unknown command: " + input);
            }

    }

    private static <A extends Animal> Stream<A> getStreamSubsetOf(List<Animal> list, Class<A> clazz) {
        return list.stream()
                .filter(clazz::isInstance)
                .map(clazz::cast);
    }

}