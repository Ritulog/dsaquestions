package binary.algorithms.com;

import java.util.Arrays;


//leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastPosition {
    public static void main(String[] args) {
      int[] arr={5,7,7,7,7,8,8,10};
      int target= 7;
        int[] postion=searchRange(arr,target);
        System.out.println(Arrays.toString(postion));

    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
//        int start=search(nums,target,true);
//        int end=search(nums,target,false);
//        ans[0] = start;
//        ans[1]=end;

        return ans;
    }

    // this function just returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // okay potential ans found but it may be possible that ans found in left hand side
                ans = mid;

                if (findStartIndex) {
                    //possible ans in left
                    end = mid - 1;
                } else {
                    //possible ans in right
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}