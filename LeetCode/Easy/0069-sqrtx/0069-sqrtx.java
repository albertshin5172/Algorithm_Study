class Solution {
    public int mySqrt(int x) {
        if(x < 2) return x;  //w.k.t sqrt(0)=0 and sqrt(1)=1 .

        int st = 0;
        int end = x;
        int rslt = 0;

        while(st <= end){
            // Declaring 'mid' outside also works fine but is less clean
            // use x/mid instead of mid*mid to avoid overflow
            int mid = st + (end - st) / 2; 
            if(mid <= x / mid){ 
                rslt = mid;      // mid^2 <= x, move start up to find bigger sqrt
                st = mid + 1;
            }else{
                end = mid - 1;   // mid^2 > x, move end down to find smaller sqrt
            }
        }

        return rslt;
    }
}