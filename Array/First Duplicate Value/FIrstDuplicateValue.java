class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int num = Math.abs(nums[i]);
            int index =num-1;
            if(nums[index]<0) return num;
            nums[index] = -nums[index];
        }
        return nums.length;
    }
}
