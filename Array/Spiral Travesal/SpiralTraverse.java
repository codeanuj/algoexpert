class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        int direction =0;

        while(left <= right && top <= bottom){
            if(direction == 0){
                for(int i=left; i<=right; i++){
                    result.add(matrix[top][i]);
                }
                top++;
            }
            if(direction == 1){
                for(int i=top; i<=bottom; i++){
                    result.add(matrix[i][right]);
                }
                right--;
            }
            if(direction == 2){
                for(int i=right; i>=left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(direction == 3){
                for(int i=bottom; i>=top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }

            direction = (direction+1)%4;
        }
        return result;
    }
}
