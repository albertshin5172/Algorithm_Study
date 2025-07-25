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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fst = head;
        ListNode snd = head;
        int i = 0;

        while(i<n){
            fst = fst.next;
            i++;
        }
        
        if(fst == null) return head.next;

        while(fst.next != null){
            fst = fst.next;
            snd = snd.next;
        }
        snd.next = snd.next.next;
        return head;
    }
}