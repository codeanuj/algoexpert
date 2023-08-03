/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        while(second != null && second.next != null){
            first = first.next;
            second = second.next.next;
            if(first == second) break;
        }

        if(second == null || second.next == null) return null;
        while(head!=first){
            head = head.next;
            first = first.next;
        }
        return head;

    }
}

// Solution take two node slow and fast fast will move twice in comparison of slow .
// If slow have moved X then fast has moved 2X. 
                            p ' ' ' '
            D                '       '
//---------------------------        '
                              '  ' ' 

//  when these two pointer meet , If slow pointer has travelled D +P distance then fast pointer has travlled 2D+2P     
// If we know the remaining distance R then we can find the node
// TOtal distance is T , Now fast has travelled 2D+2P but if remove one P from it then it is the total length of Linked list
                              T = 2D+P
                              and we also know total distance according to slow pointer is D+P+R
                              equate these two

                              D+P+R = 2D+P
                              then R=D 
                              so if we travese D distance from the place where these two pointer meets we will find the loop
                              Now what is D? D is the distance from head node till loop node.
                              
                              
                              
                                
