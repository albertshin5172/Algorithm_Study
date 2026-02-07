/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        // Traverse while fast pointer and its next node are not null
        while (fast != null && fast.next != null) {
            fast = fast.next.next; // Move fast pointer by 2 nodes
            slow = slow.next;      // Move slow pointer by 1 node

            // If both pointers meet, a cycle exists
            if (fast == slow) {
                slow = head;
                
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        // If fast pointer reaches the end, no cycle exists
        return null;   
    }
}