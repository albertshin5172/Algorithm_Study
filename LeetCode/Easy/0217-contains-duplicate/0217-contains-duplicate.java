class Solution {
    //Time Complexity : Average O(n)
    //Space Complexity : O(n)
    public boolean containsDuplicate(int[] nums) {
        //Create HashSet : Do not allow Duplicate
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums){
            // Add() execution process
            // 1.Calculate num's hashCode() -> Find the corresponding bucket location.
            // 2.If the bucket doesn't contain the value, insert the value and return true.
            // 3.If there is the duplicate value in the bucket, do not store the value and return false.
            if(!set.add(num)) return true; 
        }
        return false;
    }
}