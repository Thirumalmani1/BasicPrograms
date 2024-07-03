package BasicPrograms;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n  =17;
        int[] binaryNumber = new int[1000];
        int i = 0;
        while (n > 0) {
            binaryNumber[i] = n % 2;
            n = n/2;
            i++;
        }
        for(int j=i-1;j>=0;j--) {
            System.out.print(binaryNumber[j]);
        }
    }
}
