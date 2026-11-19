class Solution {
    public int[][] generateMatrix(int n) {
        int [][] result=new int[n][n];
        int i=0;
        int j=0;
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        int count =1;
        while(top<=bottom && left<=right ){
            for(j=left;j<=right;j++){
                result[i][j]=count;
                count++;
            }j--;
            top++;
            for(i=top;i<=bottom;i++){
                result[i][j]=count;
                count++;
            }i--;
            right--;
            if (top <= bottom) {
                for (j = right; j >= left; j--) {
                    result[i][j]=count;
                    count++;
                }
                bottom--;
                
            }j++;
             if (left <= right) {
                for (i = bottom; i >= top; i--) {
                    result[i][j]=count;
                    count++;
                }
                left++;
            }
            i=top;
            j=left;
        }return result;
        }
    }
