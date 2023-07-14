import java.util.*;

class Program {
  public int majorityElement(int[] array) {
    // Write your code here.
    int majorityElement = array[0];
    int count =0;
    for(int i=0; i<array.length; i++){
      if(count == 0){
        majorityElement = array[i];
      }

      if(majorityElement == array[i]) count++;
      else count--;
    }
    return majorityElement;
  }
}
