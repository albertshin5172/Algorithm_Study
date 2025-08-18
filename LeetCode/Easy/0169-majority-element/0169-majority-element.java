class Solution {
    public int majorityElement(int[] nums) {
        //Time complexity: O(n)
        //Space complexity: O(n)

        HashMap<Integer, Integer> map = new HashMap<>();
        int majority = 0;
        int result = 0;
        
        // Count the frequency of each element
        // getOrDefault: if num exists, get its value; otherwise start at 0
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) > majority){
                result = num;
                majority = map.get(num);
            }
        }

        return result;
    }
}