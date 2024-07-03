import java.util.*;
public class ArrayListExample
{
    public static void main(String args[]){
        ArrayList<String> newList = new ArrayList<String>();
        newList.add("Thirumal");
        newList.add("How are you?");
        newList.add("I am not ok");
        System.out.println(newList);
        System.out.println("Print one by one");
        Iterator list = newList.iterator();
        while (list.hasNext()) {
            System.out.println(list.next());
        }

        //The forEach() method is a new feature, introduced in Java 8.
        newList.forEach(x-> System.out.println(x));
    }
}
