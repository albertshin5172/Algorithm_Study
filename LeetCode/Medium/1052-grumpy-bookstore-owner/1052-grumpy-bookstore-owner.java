class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int left = 0;
        int cust = 0;
        int maxExtra = 0;
        int extra = 0;

        for(int i=0; i<grumpy.length; i++){
            if(grumpy[i] == 0) cust += customers[i];
        }

        for(int right=0; right<grumpy.length; right++){
            if(grumpy[right] == 1) extra += customers[right];

            if(right-left+1 > minutes){
                if(grumpy[left] == 1) extra -= customers[left];
                left++;
            }
            maxExtra = Math.max(maxExtra, extra);
        }

        return cust + maxExtra;
    }
}