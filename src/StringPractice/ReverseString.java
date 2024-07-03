package StringPractice;

public class ReverseString {

    public static  void main(String[] args) {

        StringBuffer sbf = new StringBuffer("MyJava");
        System.out.println("Using String Buffer");
        System.out.println(sbf.reverse());

        String str = "Thirumal";
        char[] strArray = str.toCharArray();
        System.out.println("Using char arr loop");
        for(int i = strArray.length -1; i>=0; i--) {
            System.out.print(strArray[i]);
        }
    }
}
