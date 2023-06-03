class Solution {
    public int[] sortedSquares(int[] nums) {
        int start =0;
        int end = nums.length-1;
        int squareArray[] = new int[nums.length];
        int index = nums.length-1;
       
        while(start<=end){
            int a=Math.abs(nums[start]);
            int b=Math.abs(nums[end]);
            if(a>=b){
                squareArray[index] = a*a;
                start++;
            }else{
                squareArray[index] = b*b;
                end--;
            }
            index--;
        }
        return squareArray;


    }
}
