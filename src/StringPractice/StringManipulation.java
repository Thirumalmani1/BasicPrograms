package StringPractice;

import java.util.*;

public class StringManipulation {

    public static void main(String[] args) {

        //Use StringBuilder or StringBuffer for String Concatenation
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        String result = sb.toString();
        System.out.println("Concatenated String: " + result);

        //String Concatenation
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        //Utilize String Formatting
        String name = "Alice";
        int age = 30;
        String message = String.format("My name is %s and I'm %d years old.", name, age);
        System.out.println("Formated String: " + message);

        //Use the equals() Method for String Comparison, equalsIgnoreCase(), startsWith(), endsWith(),
        String str1 = "Hello";
        String str2 = "hello";
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings are equal");
        }
        //Remove Leading and Trailing Whitespaces
        String str = "   Hello World   ";
        String trimmedStr = str.trim(); // "Hello World"
        System.out.println("Trimmed String" + trimmedStr);

        //Split Strings
        String ae = "Java is awesome";
        String[] parts = ae.split(" "); // ["Java", "is", "awesome"]

        //Convert String to Upper or Lower Case
        String ca = "Hello World";
        String upperCaseStr = ca.toUpperCase(); // "HELLO WORLD"
        String lowerCaseStr = ca.toLowerCase(); // "hello world"

        // Check for Substring Existence
        String con = "Hello World";
        if (con.contains("World")) {
           System.out.println(true);
        }
        String re = "Hello World";
        String replacedStr = re.replace("World", "Universe");
        System.out.println(replacedStr);

    }
}
