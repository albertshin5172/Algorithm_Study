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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Dummy node to simplify list construction
        ListNode dummy = new ListNode();

        // Pointer to build the result list
        ListNode cur = dummy;

        // Carry value from previous digit addition
        int carry = 0;

        // Continue while there is a digit to process or a remaining carry
        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            // Add value from first list if available
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // Add value from second list if available
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Create new node with the current digit
            cur.next = new ListNode(sum % 10);

            // Move pointer forward
            cur = cur.next;

            // Update carry for next iteration
            carry = sum / 10;
        }

        // Return the result list (skip dummy node)
        return dummy.next;
    }
}