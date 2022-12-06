package com.ing.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Zoo {
    public static final int HELLO_COMMAND = 0;
    public static final int GIVE_LEAVES = 1;
    public static final int GIVE_MEAT = 2;
    public static final int PERFORM_TRICK = 3;

    public static void main(String[] args) {

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

        var animalList = new ArrayList<Animal>() {{
            add(henk);
            add(elsa);
            add(dora);
            add(wally);
            add(marty);
        }};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

        if (input.matches("^hello\s+[a-zA-Z]+$")) {
            String[] subStrings = input.split(" ");
            String name = subStrings[1];

            switch (name) {
                case "henk" -> henk.sayHello();
                case "elsa" -> elsa.sayHello();
                case "dora" -> dora.sayHello();
                case "wally" -> wally.sayHello();
                case "marty" -> marty.sayHello();
            }
        } else {
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
    }

    private static <A extends Animal> Stream<A> getStreamSubsetOf(List<? extends Animal> list, Class<A> clazz) {
        return list.stream()
                .filter(clazz::isInstance)
                .map(clazz::cast);
    }

}