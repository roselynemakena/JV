/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author makena
 */
public class Animals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Animal[] animals = new Animal[5];
        animals[0] = new Carnivorous("Lion", 4, 2, "Mammal");
        animals[1] = new Omnivorous("Monkey", 4, 2, "Mammal");
        animals[2] = new Herbivore("Giraffe", 4, 2, "Mammal");

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            animals[i].eatFood();
        }
        animals[1].eatFood();

    }

}

class Animal {

    private String food = "NO FOOD";

    public Animal(String name, int legs, int eyes, String type) {

    }

    public void eatFood() {
        System.out.println("I eat:  " + food);
    }

}

class Carnivorous extends Animal {

    private String food = "Meat";

    public Carnivorous(String name, int legs, int eyes, String type) {
        super(name, legs, eyes, type);
    }

    public void eatFood() {
        System.out.println("I eat:  " + food);
    }
}

class Omnivorous extends Animal implements AnimalActivities {

    private String food = "Meat and vegetables";

    public Omnivorous(String name, int legs, int eyes, String type) {
        super(name, legs, eyes, type);
    }

    public void eatFood() {
        System.out.println("I eat:  " + food);
    }

    @Override
    public void walking() {
        System.out.println("I walk at an average of 50 - 90mph");
    }

    @Override
    public void runningSpeed() {
        System.out.println("I walk at an average of 150 - 190mph");

    }

    @Override
    public void age() {
        System.out.println("I live for so many years since I eat both meat and veggies");

    }

}

class Herbivore extends Animal {

    private String food = "Only Veggies";

    public Herbivore(String name, int legs, int eyes, String type) {
        super(name, legs, eyes, type);
    }

    public void eatFood() {
        System.out.println("I eat:  " + food);
    }

}
