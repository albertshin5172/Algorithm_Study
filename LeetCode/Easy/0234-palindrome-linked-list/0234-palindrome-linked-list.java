/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> val = new ArrayList<>();
        while(head != null){
            val.add(head.val);
            head = head.next;
        }
        
        int left = 0;
        int right = val.size()-1;
        
        while(left < right){
            if(val.get(left) != val.get(right)) return false;

            left++;
            right--;
        }
        return true;
    }
}