package BasicPrograms;

import java.util.*;
public class Probability {
  //Your task is to complete a function “count_heads()” that takes two inputs N and R.
  // The function should return the probability of getting exactly R heads on N successive tosses of a fair coin.
  // A fair coin has an equal probability of landing a head or a tail (i.e. 0.5) on each toss.
    public static int fact(int n)
    {
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
    public static double count_heads(int n, int r)
    {
        double res;
        res = fact(n) / (fact(r) * fact(n - r));
        res = res / (Math.pow(2, n));
        return res;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(count_heads(n,r));
    }

   // This function calculates the probability of getting exactly R heads in N coin tosses.
   // The expression fact(n) / (fact(r) * fact(n - r)) calculates the binomial
}
