/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s = 1;
        int e = n;
        while(s <= e){
            /*             
            Calculate the middle index m between s and e
            Using s + (e - s) / 2 to avoid integer overflow
            m safely splits the search range in half             
            */
            int m = s + (e-s)/2;
            if(isBadVersion(m)){
                //if m is smaller then the end, update the end index
                e = m - 1;
            }else{
                //if m is bigger then the start, update the start index
                s = m + 1;
            }
        }
        return s;
    }
}