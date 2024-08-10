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
    public int numComponents(ListNode head, int[] n) {
        ListNode temp=head;
        int count=0;
         int sum=0;
         int ans=0;
          while(temp!=null){
              for(int i=0;i<n.length;i++){
                if(temp.val==n[i]){
                    count++;
                }
              }
            if(count>0){
                sum++;
            }else{
                if(sum>0){
                ans++;
                sum=0;
                }
            }
            count=0;
            temp=temp.next;
          }
          if(sum>0){
            ans++;
          }
        return ans;
    }
}