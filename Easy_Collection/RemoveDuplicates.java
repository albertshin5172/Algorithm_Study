/*
Example 2:
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int n = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[n]){
                n++;
                nums[n]=nums[i];
            }
        }
        return n+1;
    }
    public static void main(String[] args) {
        RemoveDuplicates sol = new RemoveDuplicates();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int length = sol.removeDuplicates(nums);
        
        System.out.println("New length: " + length);

        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}