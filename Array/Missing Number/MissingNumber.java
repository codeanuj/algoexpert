import java.util.*;

class Program {
  public int[] missingNumbers(int[] nums) {
    // Write your code here.
    int xor = 0;
    
    for(int i=0; i<nums.length+3; i++){
      xor^=i;
      if(i < nums.length)
        xor^=nums[i];
    }
    int[] result = new int[2];
    int setBit = xor & (-xor);
    for(int i=0; i<nums.length+3; i++){
      if((i & setBit) == 0){
        result[0]^=i;
      }else{
        result[1]^=i; 
      }
      if(i<nums.length){
        if((nums[i] & setBit)==0){
          result[0]^=nums[i];
        }
        else{
        result[1]^=nums[i];
      }
    }
  }
    Arrays.sort(result);
    return result;
  }
}
