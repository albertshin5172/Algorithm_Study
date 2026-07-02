class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int st = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";

        while(st < end){
            while(st < end && vowels.indexOf(word[st]) == -1){
                st++;
            }

            while(st < end && vowels.indexOf(word[end]) == -1){
                end--;
            }

            char temp = word[st];
            word[st] = word[end];
            word[end] = temp;

            st++; 
            end--;
        }

        return String.valueOf(word);
    }
}