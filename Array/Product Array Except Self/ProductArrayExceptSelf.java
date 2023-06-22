class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*int leftArray[] = new int[nums.length];
        int rightArray[] = new int[nums.length];
        Arrays.fill(leftArray, 1);
        Arrays.fill(rightArray, 1);
        int product = 1;

        for(int i=1; i<nums.length; i++){
            product*=nums[i-1];
            leftArray[i] = product;
        }    
        product =1;
          for(int i=nums.length-2; i>=0; i--){
            product*=nums[i+1];
            rightArray[i] = product;
        }     

        int[] result = new int[nums.length];

        for(int i=0; i<result.length; i++){
            result[i] = leftArray[i]*rightArray[i];
        }

        return result;
        */

        int[] result = new int[nums.length];
        Arrays.fill(result, 1);
        int product =1;
        for(int i=1; i<nums.length; i++){
            product*=nums[i-1];
            result[i] = product;
        }
        product =1;
        for(int i=nums.length-2; i>=0; i--){
            product*=nums[i+1];
            result[i] *= product;
        }
        return result;
    }
}
