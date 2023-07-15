import java.util.*;

class Program {

  public int bestSeat(int[] seats) {
    int left = 0;
    int right = 0;
    int bestSeat = -1;

    int maxSpace = 0;

    while(left < seats.length){
      right = left+1;
      while(right<seats.length && seats[right] == 0) right++;
      int space = right-left-1;

      if(space > maxSpace){
        bestSeat = (right+left)/2;
        maxSpace = space;
      } 
      left =right;
    }
    return bestSeat;
  }
}
