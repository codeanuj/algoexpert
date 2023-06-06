import java.util.*;

class Program {
  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    // Write your code here.
    Arrays.sort(arrayOne);
    Arrays.sort(arrayTwo);
    //-1, 3, 5, 10, 20, 28
    //15, 17, 26, 134, 135    
    int i = 0;
    int j = 0;
    int answer = Integer.MAX_VALUE;
    int difference = 0;
    int[] array = new int[2];
    while(i<arrayOne.length && j<arrayTwo.length){
      difference = Math.abs(arrayOne[i]-arrayTwo[j]);
      if(difference<answer){
        answer = difference;
        array[0] = arrayOne[i];
        array[1] = arrayTwo[j];
      } 
      if(arrayOne[i]<=arrayTwo[j])i++;
      else j++;
    }
    return array;
  }
}
