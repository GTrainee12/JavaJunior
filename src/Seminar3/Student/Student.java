package Seminar3.Student;

import lombok.Getter;
import lombok.Setter;

import java.io.*;


@Getter
@Setter

public class Student implements Serializable {
    private String name;
    private int age;
    private transient double GPA;

    public Student(String name, int age, double GPA) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }
    public static void main(String[] args) {
        Student student = new Student("Genre", 20, 3.5);


        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student restoredStudent = (Student) ois.readObject();

            System.out.println("Name: " + restoredStudent.getName());
            System.out.println("Age: " + restoredStudent.getAge());
            System.out.println("GPA: " + restoredStudent.getGPA());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}