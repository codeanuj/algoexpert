import java.util.*;

class Program {

  public int nonConstructibleChange(int[] coins) {
    // Write your code here.
    Arrays.sort(coins);
    int coinSum = 0;

    for(int i=0; i<coins.length; i++){
      if(coinSum+1 < coins[i]) break;
      coinSum+=coins[i];
    }
    return coinSum+1;
  }
}
