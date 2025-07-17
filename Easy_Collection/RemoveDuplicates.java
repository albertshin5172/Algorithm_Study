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