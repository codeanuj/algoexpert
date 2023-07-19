import java.util.*;

class Program {

  public int[] longestSubarrayWithSum(int[] array, int targetSum) {
    // Write your code here.
    int left =0;
    int right = 0;
    int sum = 0;
    int[] result = new int[]{};
   
    while(right<array.length){
      sum+=array[right];
      while(left<right && sum>targetSum){
        sum-=array[left];
        left++;
      }
      if(sum == targetSum){
        if(result.length == 0 || result[1]-result[0]<right-left){
          result = new int[]{left,right};
        }
      }
      right++;
    }
    return result;
  }
}
