class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length-1;
        int m=matrix.length;
        int [][] res =new int[m][m];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                res[j][n]=matrix[i][j];
            }
            n--;
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=res[i][j];
            }
        }
        
    }
}