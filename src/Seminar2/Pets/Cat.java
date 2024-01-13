package Seminar2.Pets;

public class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    public void scratch() {
        System.out.println("Cat is scratching.");
    }

    // Геттер и сеттер для поля color

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}