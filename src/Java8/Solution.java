package Java8;

import java.util.List;
import java.util.function.Predicate;

public class Solution {
    @FunctionalInterface
    interface CheckPerson {
        boolean testPerson(Person people);

    }

    static class CheckPersonEligibleForSelectiveSearch implements CheckPerson {
        @Override
        public boolean testPerson(Person people) {
            return people.gender == Person.Gender.FEMALE && people.getAge() >= 1 && people.getAge() <= 25;
        }
    }

    public static void printPersonOlderThan(List<Person> people, int age) {
        for (Person p : people) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    public static void printPersonWithinAgeRange(List<Person> people, int lowerAgeRange, int higherAgeRange) {
        for (Person p : people) {
            if (lowerAgeRange <= p.getAge() && p.getAge() < higherAgeRange) {
                p.printPerson();
            }
        }
    }

    public static void printPeople(List<Person> people, CheckPerson checkPerson) {
        for(Person p: people) {
            if(checkPerson.testPerson(p)) {
                p.printPerson();
            }
        }
    }

    public static void printPeopleWithPredicate(List<Person> people, Predicate<Person> predicate) {
        for(Person p: people) {
            if(predicate.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void main(String[] args) {
        List<Person> people = Person.generateDefaultList();
        // printPersonOlderThan(people, 30);
        // printPersonWithinAgeRange(people, 26, 31);
        // printPeople(people, new CheckPersonEligibleForSelectiveSearch());

        /*printPeople(people, new CheckPerson() {
            @Override
            public boolean testPerson(Person people) {
                return people.gender == Person.Gender.FEMALE && people.getAge() >= 1 && people.getAge() <= 25;
            }
        });*/

        /*printPeople(people, p -> {
                return p.gender == Person.Gender.FEMALE && p.getAge() >= 1 && p.getAge() <= 25;
            }
        );*/

        printPeopleWithPredicate(people, p -> p.gender == Person.Gender.FEMALE && p.getAge() >= 1 && p.getAge() <= 25);

        //printPeople(people, p -> p.gender == Person.Gender.FEMALE && p.getAge() >= 1 && p.getAge() <= 25);
    }
}
