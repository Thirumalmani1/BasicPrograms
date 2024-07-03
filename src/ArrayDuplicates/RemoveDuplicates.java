package ArrayDuplicates;

import java.util.Scanner;
//Remove duplicates from a sorted array You are given a sorted integer array' ARR' of size 'N'.
// You need to remove the duplicates from the array such that each element appears only once. Return the length of this new array. Note: Do not allocate extra space for another array. You need to do this by modifying the given input array in-place with O(1) extra memory. Input format: The first line of input contains an integer ‘T’ denoting the number of test cases. The first line of each test case contains an integer ‘N’ denoting the number of elements in the array.
// The second line of each test case contains ‘N’ space-separated integers representing the elements of the array.
public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        // Initialize the last unique index
        int lastUniqueIndex = 0;

        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[lastUniqueIndex]) {
                lastUniqueIndex++;
                arr[lastUniqueIndex] = arr[i];
            }
        }

        // The length of the array without duplicates
        return lastUniqueIndex + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();  // Read number of test cases
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();  // Read the size of the array
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();  // Read the array elements
            }

            int newLength = removeDuplicates(arr);
            System.out.println(newLength);
        }

        scanner.close();
    }
}
