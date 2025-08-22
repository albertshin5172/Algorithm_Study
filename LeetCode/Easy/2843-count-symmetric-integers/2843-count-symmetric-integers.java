class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int result = 0;

        for(int i=low; i<=high; i++){
            if(i < 100 && i % 11 == 0) result++;
            else if(1000 <= i && i < 10000){
                int lVal = i/1000 + (i % 1000) / 100;
                int rVal = (i % 100) / 10 + (i%10);

                if(lVal == rVal) result++;
            }
        }

        return result;
    }
}