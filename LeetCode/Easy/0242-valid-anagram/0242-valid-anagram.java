class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArr1 = s.toCharArray(); // String to Char Array
        char[] charArr2 = t.toCharArray(); // String to Char Array
        Arrays.sort(charArr1); // Char Array1 Alphabetical Sort
        Arrays.sort(charArr2); // Char Array2 Alphabetical Sort
        // Convert char array to String (String.valueOf(charArr1)(+charArr2) gives the same result)  
        String result1 = new String(charArr1); 
        String result2 = new String(charArr2);   
        
        if(result1.equals(result2)) return true;
        else return false;
    }
}