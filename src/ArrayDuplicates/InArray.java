package ArrayDuplicates;

import java.util.Arrays;
import java.util.stream.IntStream;


public class InArray
{
   public static void main(String[] args) {
       String[] fruits = {"banana","apple","orange","guva"};
       String banana = "banana";

       if (Arrays.asList(fruits).contains(banana)) {
           System.out.println(banana + " is in the array");
       } else {
           System.out.println(banana + "is not in the array");
       }

       int[] array = {1, 2, 3, 4, 5};
       int value = 3;
       boolean contains = IntStream.of(array).anyMatch(x -> x == value);

       if (contains) {
           System.out.println(value + " is in the array");
       } else {
           System.out.println(value + " is not in the array");
       }
   }

 }
