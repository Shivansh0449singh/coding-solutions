class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
       int [] res=new int[m*n];
       int k=0;
       int i=0;
       int j=0;
       int sum=0;
       for(k=0; k<m*n ; k++){
            res[k]=mat[i][j];
            sum=i+j;
            if(sum % 2==0){
                if(j==n-1 ){
                    i++;
                }else if(i==0 ){
                    j++;
                }else {
                    i--;
                    j++;
                }
            }else{
                if(j==0 && i<m-1 ){
                    i++;
                }else if(i==m-1  ){
                    j++;
                }else{
                    i++;
                    j--;
                }
            }
        
       }return res;
    }
}