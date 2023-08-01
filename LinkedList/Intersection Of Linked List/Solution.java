/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeOne = headA;
        ListNode nodeTwo = headB;

        while(nodeOne != nodeTwo){
            nodeOne = (nodeOne == null)?headB:nodeOne.next;
            nodeTwo = (nodeTwo == null)?headA:nodeTwo.next;
        }
        return nodeOne;
    }
}
