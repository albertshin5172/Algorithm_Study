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
    public ListNode reverseList(ListNode head) {
        /*
            We use three pointers:
            prev → tracks the previous node (initially null).
            curr → current node we're processing (starts at head).
            next → temporarily stores the next node so we don't lose access.
            Steps: Store next = curr.next.
            Reverse: curr.next = prev.
            Move forward:
            prev = curr
            curr = next
            Repeat until curr == null.
            Finally, prev will point to the new head of the reversed list.
        */
        if(head == null) return null;

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;

        while(curr != null){
            curr.next = prev;
            prev=curr;
            curr=next;
            if(next != null) next = next.next;
        }

        return prev;
    }
}