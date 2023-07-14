
import java.util.*;

class Program {
  public static int[] largestRange(int[] array) {
    // Write your code here.
    
    HashSet<Integer> set = new HashSet<Integer>();
    for(int num:array) set.add(num);
    int result[] = new int[2];
    for(int i=0; i<array.length; i++){
      if(set.contains(array[i]+1)) continue;
      int max = array[i];
      while(set.contains(--max));
      max++;
      //+1 because if input array is of [1,1]
      if(result[1]-result[0]<array[i]-max+1){
        result[0]=max;
        result[1]=array[i];
      }
    }
    return result;
  }
}
