class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int [] a=new int[mat.length*mat[0].length];
        int k=0;
        if(mat.length*mat[0].length != r*c){
            return mat;
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                a[k]=mat[i][j];
                k++;
            }
        }int [][] result=new int[r][c];
        k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                result[i][j]=a[k];
                if(k<a.length){
                    k++;
                }
            }
        }return result;

    }
}