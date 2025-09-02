class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int left = 0;
        Set<Character> window = new HashSet<>(); // 현재 윈도우에 있는 문자들
        
        for(int right=0; right<s.length(); right++){
            char c = s.charAt(right);

            while(window.contains(c)){
                window.remove(s.charAt(left));
                left++;
            }
            window.add(c);

            result = Math.max(result, right-left+1);
        }
        return result;
    }
}