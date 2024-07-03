package StreamPractice;

import java.util.*;
import java.util.stream.*;

public class StreamExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,4,6,8,0,1);
        // demonstration of map method
        List<Integer> square = numbers.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(square);
        //Use foreach method to print
        numbers.stream().map(x -> x * x).forEach(y-> System.out.println(y));
        // demonstration of filter method
        List<String> name = Arrays.asList("Thirumal","Sriram","Senthil","Ashok");
        List<String> nameStartWithS = name.stream().filter(n -> n.startsWith("S")).collect(Collectors.toList());
        System.out.println(nameStartWithS);
        // demonstration of Sorted method
        List<String> sortedName = name.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedName);
        //demonstration of reduce method
        List<Integer> number = Arrays.asList(2,3,4,5);
        int even = number.stream().filter(x -> x % 2 == 0).reduce(0,(a,b)->a+b);
        System.out.println(even);
    }
}
