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
    public ListNode middleNode(ListNode head) {
        // Slow pointer moves one step at a time.
        ListNode slow = head;
        // Fast pointer moves two steps at a time.
        ListNode fast = head;

        // Move fast pointer two nodes and slow pointer one node
        // until fast reaches the end of the linked list.
        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;
        }

        // When fast reaches the end,
        // slow will be pointing to the middle node.
        return slow;
    }
}