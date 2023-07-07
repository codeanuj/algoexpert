class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row=0;
        int col=0;
        int height = mat.length-1;
        int width = mat[0].length-1;
        boolean goingUp = true;
        int[] result = new int[(height+1)*(width+1)];
        int index=0;

        while(!isOutOfBound(row, col, height, width)){
            result[index] = mat[row][col];
            if(goingUp){
                if(col == width || row == 0){
                    goingUp = false;
                    if(col == width) row+=1;
                    else col+=1;
                }else{
                    row-=1;
                    col+=1;
                }
            }else{
                if(col == 0 || row == height){
                    goingUp = true;
                    if(row == height) col+=1;
                    else row+=1;
                }else{
                    row+=1;
                    col-=1;
                }
            }
            index++;
        }  
        return result;         
    }

    private boolean isOutOfBound(int row, int col, int height, int width){
        return row<0 || col<0 || row>height || col>width;
    }
}
