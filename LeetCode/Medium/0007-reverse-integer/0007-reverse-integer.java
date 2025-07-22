class Solution {
    public int reverse(int x) {        
        //It prevents exceeding the maximum or minimum value.
        //This helps to detect overflow beyond the 32-bit integer range
        long revNum =0;

/*
        // Repeat until all digits of x have been processed
        while (x != 0) {
            // Extract the last digit of x
            int tmpNum = x % 10;

            // Get rid of the last digit from x
            x /= 10;
            //Append the extracted digit to revNum by shifting digits to the left and adding tmpNum
            revNum = revNum*10 + tmpNum;
        }
*/

        // Revised to be simpler.
        while(x != 0){
            revNum =  revNum*10 + x%10;
             x /= 10;
        }
/*
        //Overflow check
        if(revNum > Integer.MAX_VALUE || revNum < Integer.MIN_VALUE) {
            return 0;  //Integer.max_value handle long value
        }
        return (int) revNum;
*/
        //Enhance runtime performance.
        return (revNum > Integer.MAX_VALUE || revNum < Integer.MIN_VALUE ? 0 : (int)revNum);
    }
}