class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int firstMajoritySum = 0;
        int secondMajoritySum = 0;

        int firstMajorityElement = Integer.MAX_VALUE;
        int secondMajorityElement = Integer.MIN_VALUE;


        for(int i=0; i<nums.length; i++){
            if(nums[i] == firstMajorityElement){
                firstMajoritySum++;
            }else if(nums[i] == secondMajorityElement){
                secondMajoritySum++;
            }else if(firstMajoritySum == 0){
                firstMajorityElement = nums[i];
                firstMajoritySum++;
            }else if(secondMajoritySum == 0){
                secondMajorityElement = nums[i];
                secondMajoritySum++;
            }else{
                firstMajoritySum--;
                secondMajoritySum--;
            }
        }
        firstMajoritySum=0;
        secondMajoritySum=0;


        for(int i=0; i<nums.length; i++){
            if(nums[i] == firstMajorityElement) firstMajoritySum++;
            else if(nums[i] == secondMajorityElement) secondMajoritySum++;
            else continue;
        }
       
        List<Integer> list = new ArrayList<Integer>();
        if(firstMajoritySum > nums.length/3) list.add(firstMajorityElement);
        if(secondMajoritySum > nums.length/3) list.add(secondMajorityElement);

        return list;
    }
}
