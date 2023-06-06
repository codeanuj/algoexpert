import java.util.*;

class Program {
  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
    // Write your code here.
    int i=0; 
    
//This will make sure that it does retain the order of elements
    while(i < array.size()){
      if(array.get(i) == toMove) break;
      i++;
    }
    int j = i+1;
    while(j<array.size()){
      if(array.get(j) != toMove){
        Collections.swap(array, i, j);
        i++;
      }
      j++;
    }
    return array;
  }
}
