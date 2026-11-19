class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean a=false;
        if(matrix.length==1 || matrix[0].length == 1){
            a=true;
            return a;
        }
       for(int i=1;i<matrix.length;i++){
           for(int j=1;j<matrix[i].length;j++){
            if(matrix[i][j]==matrix[i-1][j-1]){
                a=true;
            }else{
                a=false;
                return a;
            }
           }
        }return a;
    }
}