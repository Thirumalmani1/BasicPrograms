package StringPractice;

public class RemoveWhiteSpaces {
    public static void main(String[] args)
    {
        String inputString = "Thirumal mani";
        String stringWithoutSpaces = inputString.replaceAll("\\s+", "");
        System.out.println("Input String : "+inputString);
        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
    }
}
