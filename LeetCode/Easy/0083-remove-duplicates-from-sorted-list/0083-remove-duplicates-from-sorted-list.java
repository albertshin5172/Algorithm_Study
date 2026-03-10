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
    public ListNode deleteDuplicates(ListNode head) {
        // Pointer used to traverse the linked list
        ListNode node = head;

        // Traverse the list while the current node and the next node exist
        while (node != null && node.next != null) {

            // If the current node value is the same as the next node value,
            // skip the next node by adjusting the pointer
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                // Otherwise, move to the next node
                node = node.next;
            }
        }

        // Return the head of the modified list
        return head;
    }
}