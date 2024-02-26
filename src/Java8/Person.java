package Java8;

import java.util.ArrayList;
import java.util.List;

public class Person {

    public enum Gender {
        MALE, FEMALE;
    }

    String name;
    int age;
    String email;
    Gender gender;

    public Person() {

    }

    public Person(String name, int age, String email, Gender gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void printPerson() {
        System.out.println(this.toString());
    }

    public static List<Person> generateDefaultList() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Navaneeth", 33, "nav@gmail.com", Gender.MALE));
        people.add(new Person("Surabhi", 30, "sur@gmail.com", Gender.FEMALE));
        people.add(new Person("Aanya", 1, "aanya@gmail.com", Gender.FEMALE));

        return people;
    }
}
