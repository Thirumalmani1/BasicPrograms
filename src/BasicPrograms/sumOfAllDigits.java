package BasicPrograms;

public class sumOfAllDigits {
    public static void main(String[] args) {
        sum(47862);
    }
    static  void sum(int num) {
        int copyOfInputNumber = num;
        int sum =0;
        while (copyOfInputNumber != 0) {
            int lastDigit = copyOfInputNumber % 10;
            sum = sum + lastDigit;
            copyOfInputNumber = copyOfInputNumber / 10;
        }
        System.out.println("Sum Of All Digits In "+num+" = "+sum);
    }
}
