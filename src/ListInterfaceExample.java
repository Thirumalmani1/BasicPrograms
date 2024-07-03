import java.util.*;

public class ListInterfaceExample {
    public static void main(String args[]){
        List<String> list=new ArrayList<String>();
        list.add("Thirumal");
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        for(String fruit:list) {
            System.out.println(fruit);
        }
    }
}
