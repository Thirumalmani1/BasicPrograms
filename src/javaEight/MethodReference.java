package javaEight;

import java.util.*;


class Person {

    private String name;
    private Integer age;

    // Constructor
    public Person(String name, int age)
    {
        // This keyword refers to current instance itself
        this.name = name;
        this.age = age;
    }

    // Getter-setters
    public Integer getAge() { return age; }
    public String getName() { return name; }
}

public class MethodReference {

    public static int compareByName(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }

    public static int compareByAge(Person p1, Person p2) {
        return p1.getAge().compareTo(p2.getAge());
    }

    public static void main(String[] args) {
        List<Person> personListlist = new ArrayList<Person>();
        personListlist.add(new Person("Abi", 10));
        personListlist.add(new Person("Bala", 20));
        personListlist.add(new Person("Chandran", 30));
        personListlist.add(new Person("Dhanaseker", 40));

        // Using static method reference to
        // sort array by name
        Collections.sort(personListlist, MethodReference::compareByName);
        System.out.println("Sort by name :");
        personListlist.stream().map(Person::getName).forEach(System.out::println);

        Collections.sort(personListlist, MethodReference::compareByAge);
        System.out.println("Sort by age :");
        personListlist.stream().map(Person::getAge).forEach(System.out::println);


        List<String> personList = new ArrayList<>();

        // Adding elements to above object of List
        // using add() method
        personList.add("vicky");
        personList.add("poonam");
        personList.add("sachin");

        // Method reference to String type
        Collections.sort(personList,
                String::compareToIgnoreCase);

        // Printing the elements(names) on console
        personList.forEach(System.out::println);

    }


}
