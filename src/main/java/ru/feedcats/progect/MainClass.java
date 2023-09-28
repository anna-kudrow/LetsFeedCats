package ru.feedcats.progect;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Barsik", 5, false),
                new Cat("Pupsik", 40, false),
                new Cat("Glazik", 10, false),
                new Cat("Fixik", 55, false),
                new Cat("Kedi", 0, true)
        };

        Plate plate = new Plate(100);



//        public static void processEating (Cat[]cats){

            for (Cat kitty : cats) {

                if (kitty.getAppetite() == 0) {
                    System.out.printf("\n%s is not hungry", kitty.name);
            }
                else if (plate.getFood() >= kitty.getAppetite()) {
                    kitty.eat();
                    System.out.printf("\n%s had a meal", kitty.name);
                    plate.setFood(plate.getFood() - kitty.getAppetite());
                    kitty.setAppetite(0);
                    kitty.full = true;
                }


                else if (kitty.getAppetite() > 0 && plate.getFood() < kitty.getAppetite()) {
                    System.out.printf("\nThere is no enough food for %s", kitty.name);
                }
            }
        plate.addFood(plate.getFood());
        }

}
