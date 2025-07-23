package binary.algorithms.com;

import java.util.Arrays;


//brute force approach
public class FirstAndLastPosition1 {
    public static int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;

        // Traverse from the beginning to find the first occurrence
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                start = i;
                break;  // stop at the first match
            }
        }

        // Traverse from the end to find the last occurrence
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                end = i;
                break;  // stop at the last match
            }
        }

        return new int[]{start, end};
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        System.out.println(Arrays.toString(searchRange(nums1, target1))); // Output: [3, 4]

        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        System.out.println(Arrays.toString(searchRange(nums2, target2))); // Output: [-1, -1]

        int[] nums3 = {};
        int target3 = 0;
        System.out.println(Arrays.toString(searchRange(nums3, target3))); // Output: [-1, -1]
    }
}
