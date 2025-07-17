/*
Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

public class Rotate {
    public void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
          a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
          nums[i] = a[i];
        }
        for (int arr : nums) {
            System.out.print(arr + " ");
        }
    }
    public static void main(String[] args) {
        Rotate sol = new Rotate();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        sol.rotate(nums, k);
    }
}
