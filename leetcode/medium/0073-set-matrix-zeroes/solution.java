class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }for(int row : rows){
            for(int j=0;j<matrix[0].length;j++){
                matrix[row][j]=0;
            }
        }for(int col : cols){
            for(int i=0;i<matrix.length;i++){
                matrix[i][col]=0;
            }
        }
    }
}