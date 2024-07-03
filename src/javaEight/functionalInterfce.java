package javaEight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class functionalInterfce {

    public static void main(String args[])
    {
        // create anonymous inner class object
        new Thread(new Runnable() {
            @Override public void run()
            {
                System.out.println("New thread created");
            }
        }).start();
        // functional interface using lambda expressions
        new Thread(()-> System.out.println("New thread created in lamda")).start();

        List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "Charlie");

        List<String> result = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        result.forEach(System.out::println);

    }
}
