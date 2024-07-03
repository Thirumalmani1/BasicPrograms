public class FindUniqueIdUsingBitwise {
    public static int findUniqueID(int[] nums) {
        int uniqueID = 0;
        for (int num : nums) {
            uniqueID ^= num;
        }
        return uniqueID;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 4, 6, 2};
        int uniqueID = findUniqueID(nums);
        System.out.println("The unique ID is: " + uniqueID);
    }
}
