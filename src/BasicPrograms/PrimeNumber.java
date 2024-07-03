package BasicPrograms;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    public static void main(String[] args) {
        int[] array = {5,7,8,4,11,9,3,2,1};
        List<Integer> result = findPrimeNumbers(array);
        result.forEach(x -> System.out.println(x));
    }

    public static List<Integer> findPrimeNumbers(int[] primeNumbers) {
        List<Integer> prime = new ArrayList<>();
         for(int num : primeNumbers) {
             if(isPrime(num)) {
                 prime.add(num);
             }
         }
         return  prime;
    }

    public static boolean isPrime(int n ) {
        if(n <= 1) {
            return false;
        }
        for(int i=2;i<= Math.sqrt(n);i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
