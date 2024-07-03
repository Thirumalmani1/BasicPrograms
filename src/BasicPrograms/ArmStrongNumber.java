package BasicPrograms;

//An Armstrong number is a special kind of number in math.
// It's a number that equals the sum of its digits, each raised to a power
public class ArmStrongNumber {

    public static void main(String[] args) {
        checkArmstrongNumber(153);
    }

    public static void checkArmstrongNumber(int armNumber) {
        int copyArmNumber = armNumber;
        int lengthArmNumber = String.valueOf(armNumber).length();
        int numSum = 0;
        while (copyArmNumber != 0) {
            int lastDigit = copyArmNumber %10;
            int lastdigitnumber =1;
            for(int i= 0 ; i< lengthArmNumber; i++) {
                lastdigitnumber = lastdigitnumber * lastDigit;
            }
            numSum = numSum + lastdigitnumber;
            copyArmNumber = copyArmNumber/10;
        }
        if(numSum == armNumber) {
            System.out.println(armNumber+" is an armstrong number");
        }
        else {
            System.out.println(armNumber + " is not an armstrong number");
        }
    }
}
