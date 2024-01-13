package Seminar2.Pets;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Buddy", 3, "Golden Retriever");
        animals[1] = new Cat("Whiskers", 5, "Tabby");
        animals[2] = new Dog("Max", 2, "Poodle");
        for (Animal animal : animals) {
            Class<?> clazz = animal.getClass();
            System.out.println("Class: " + clazz.getSimpleName());
            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());
            try {
                Method makeSoundMethod = clazz.getDeclaredMethod("makeSound");
                makeSoundMethod.invoke(animal);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                System.out.println("No makeSound() method found.");
            }
            System.out.println();
        }
    }


}
