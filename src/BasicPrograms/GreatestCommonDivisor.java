package BasicPrograms;

public class GreatestCommonDivisor {

    // Function to return gcd of a and b
    static int gcd(int a, int b)
    {
        // Find Minimum of a and b
        int minNumber = Math.min(a, b);
        while (minNumber > 0) {
            if (a % minNumber == 0 && b % minNumber == 0) {
                break;
            }
            minNumber--;
        }

        // Return gcd of a and b
        return minNumber;
    }

    // Driver code
    public static void main(String[] args)
    {
        int a = 19, b = 64;
        System.out.print("GCD of " + a + " and " + b
                + " is " + gcd(a, b));
    }
}
