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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        /* 
        Dummy nodes serve as a useful tool for simplifying code by minimizing special cases when inserting 
        or deleting nodes in a linked list. They allow operations to be handled uniformly, 
        without having to treat the head node differently.  
        */
        ListNode dummy = new ListNode(-1);
        ListNode mList=dummy;

        while(list1 !=null && list2 !=null){
            if(list1.val<list2.val){
                mList.next = list1;
                list1 = list1.next;
            }else{
                mList.next = list2;
                list2 = list2.next;
            }
            mList = mList.next;
        }
        if(list1 == null){
            mList.next = list2;
        }
        if(list2 == null){
            mList.next = list1;
        }
        return dummy.next;
    }
}