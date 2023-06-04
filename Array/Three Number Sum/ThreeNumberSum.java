import java.util.*;

class Program {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    // Write your code here.
    Arrays.sort(array);
    List<Integer[]> list = new ArrayList<Integer[]>();
    for(int i=0; i<array.length; i++){
      int key =targetSum-array[i];

      int start = i+1;
      int end = array.length-1;

      while(start<end){
        if(array[start] + array[end] == key){
          list.add(new Integer[]{array[i], array[start], array[end]});
          start++;
          end--;
        }else if(array[start] + array[end] > key) end--;
        else start++;
      }
    }    
    return list;
  }
}
