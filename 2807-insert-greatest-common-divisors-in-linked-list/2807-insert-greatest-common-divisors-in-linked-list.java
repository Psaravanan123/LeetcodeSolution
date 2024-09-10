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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
     
     ListNode temp=head;
     while(temp.next!=null)  {
        int min=Math.min(temp.val,temp.next.val);
         for(int i=min;i>=1;i--){
            if(temp.val%i==0 && temp.next.val%i==0){
                ListNode newnode=new ListNode(i);
              newnode.next=temp.next;
              temp.next=newnode;
              
               break;
            }
         }
         temp=temp.next.next;
     }
     
     return head;
    }
}