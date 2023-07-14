import java.util.*;

class Program {
  public boolean zeroSumSubarray(int[] nums) {
    // Write your code here.
    HashSet<Integer> set = new HashSet<Integer>();
    set.add(0);

    int sum=0;
    for(int i=0; i<nums.length; i++){
      sum+=nums[i];
      if(nums[i] == 0 || sum == 0 || !set.add(sum))
        return true;
    }
    return false;
  }
}
