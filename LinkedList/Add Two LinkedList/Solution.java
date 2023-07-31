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
         int carry = 0;

    ListNode prev = new ListNode(0);
    ListNode node = null;
    ListNode head = prev;
    
    while(l1 != null || l2 != null || carry!=0){
      int valueOne = (l1 != null)?l1.val:0;
      int valueTwo = (l2 != null)?l2.val:0;
      
      int sum = valueOne+valueTwo+carry;
      node = new ListNode(sum%10);
      prev.next= node;
      prev=node;
      carry = sum/10;
      if(l1!=null) l1 = l1.next;
      if(l2!=null) l2 = l2.next;
      
    }
    return head.next;
    }
}
