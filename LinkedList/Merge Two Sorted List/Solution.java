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
        
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode p1 =list1;
        ListNode p2 =list2;
        ListNode prev =null;

        while(p1 != null && p2 != null){
            if(p1.val<=p2.val){
                prev = p1;
                p1 =p1.next;
            }else{
               if(prev!=null) prev.next= p2;
               prev=p2;
               p2=p2.next;
               prev.next = p1;
            }
        }

        if(p1 == null && prev!=null){
            prev.next=p2;
        }
        return list1.val>list2.val?list2:list1;
    }
}
