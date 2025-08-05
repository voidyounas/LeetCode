import java.util.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int array[] = new int[sc.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int[] result = twoSum(array, n);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {

                    return new int[] { i, j };//returns array.

                }
            }
        }
        return new int[] { -1, -1 };
    }
}
