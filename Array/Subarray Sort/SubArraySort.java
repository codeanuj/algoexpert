class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        if(nums.length == 1) return 0;
        for(int i=0; i<nums.length; i++){
            if(orderMismatch(i, nums[i], nums)){
                minValue = Math.min(minValue, nums[i]);
                maxValue = Math.max(maxValue, nums[i]);
            }
        }

        if(minValue == Integer.MAX_VALUE) return 0;
        int subArrayLeftIndex = 0;
        int subArrayRightIndex = nums.length-1;

        while(minValue>=nums[subArrayLeftIndex]) subArrayLeftIndex++;
        while(maxValue<=nums[subArrayRightIndex]) subArrayRightIndex--;

        return subArrayRightIndex-subArrayLeftIndex+1;

    }

    private boolean orderMismatch(int i, int num, int[] nums){
        if(i==0) return nums[i+1]<num;
        if(i==nums.length-1) return nums[i-1]>num;

        return nums[i+1]<num || nums[i-1]>num;
    }
}
