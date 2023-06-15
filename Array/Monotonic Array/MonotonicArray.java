class Solution {
    public boolean isMonotonic(int[] nums) {
        /*boolean isNonIncreasing = true;
        boolean isNonDecreasing = true;

        for(int i = 1; i<nums.length; i++){
            if(nums[i] < nums [i-1])
               isNonIncreasing = false;
            if(nums[i] > nums [i-1])
               isNonDecreasing = false;   
        }

        return isNonIncreasing || isNonDecreasing; */
        if(nums.length<=2) return true;
        int direction = nums[1] - nums[0];
        for(int i=1; i<nums.length; i++){
            if(direction == 0){
                direction = nums[i] - nums[i-1];
                continue;
            }
           if(breaksDirection(nums, nums[i-1], nums[i], direction)) return false;
        }
        return true;
    }

    private boolean breaksDirection(int[] nums, int previous, int current, int direction){
        int difference = current - previous;
        if(direction > 0) return difference < 0;
        return difference>0;
    }
}
