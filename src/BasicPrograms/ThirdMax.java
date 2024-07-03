package BasicPrograms;

public class ThirdMax {

    public static void main(String[] args) {
        int[] nums = {4,7,2,8,5,9,0,1};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long secondmax = Long.MIN_VALUE;
        long thirdmax = Long.MIN_VALUE;
        for(int num:nums) {
            if(num > max) {
                thirdmax = secondmax;
                secondmax = max;
                max = num;
            } else if(num > secondmax && num < max) {
                thirdmax = secondmax;
                secondmax = num;
            } else if(num > thirdmax && num < secondmax) {
                thirdmax = num;
            }
        }
        int result = (int)thirdmax;
        return  result;

    }
}
