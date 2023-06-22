class Solution {
    public int longestMountain(int[] arr) {
        int i = 1;
        int longestMountain = 0;
        boolean isPeak = false;
        while(i<arr.length-1){
            isPeak = (arr[i]>arr[i-1] && arr[i]>arr[i+1])?true:false;

            if(!isPeak){
                i++;
                continue;
            }

            int leftIndex = i-2;
            int rightIndex = i+2;

            while(leftIndex>=0 && arr[leftIndex]<arr[leftIndex+1]) leftIndex--;
            while(rightIndex<arr.length && arr[rightIndex]<arr[rightIndex-1]) rightIndex++;

            int currentLong = rightIndex - leftIndex - 1;
            longestMountain = Math.max(longestMountain, currentLong);
            i = rightIndex;
        }

        return longestMountain;
    }
}
