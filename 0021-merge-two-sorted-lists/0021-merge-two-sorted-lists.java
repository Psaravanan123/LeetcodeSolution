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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Dummy node to serve as the starting point
        ListNode dummy = new ListNode();
        // Pointer to build the new list
        ListNode temp = dummy;
        
        // Merge the two lists
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        
        // Append remaining nodes of l1 or l2
        if (l1 != null) {
            temp.next = l1;
        } else {
            temp.next = l2;
        }
        
        // Return the next node of dummy since dummy itself is just a placeholder
        return dummy.next;
    }
}