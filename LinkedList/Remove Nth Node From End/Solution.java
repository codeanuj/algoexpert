import java.util.*;

class Program {
  public static void removeKthNodeFromEnd(LinkedList head, int k) {
    LinkedList first = head;
    LinkedList second = head;
    int counter = 1;
    while(counter<=k){
      second = second.next;
      counter++;
    }

    if(second == null){
      head.value = head.next.value;
      head.next = head.next.next;
      return;
    }

    while(second.next != null){
      second = second.next;
      first = first.next;
    }
    first.next = first.next.next;
    // Write your code here.
  }

  static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
}
