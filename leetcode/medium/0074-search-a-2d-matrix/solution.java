class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix[0].length;
        int m=matrix.length;
        int low=0;
        int high= m*n - 1;
        while(low<=high){
            int mid= (low + high)/2;
            int row=mid/n;
            int cols=mid % n;
            if(matrix[row][cols] == target){
                return true;
            }else if(matrix[row][cols] < target){
                low=mid+1;
            }else if(matrix[row][cols] > target){
                high=mid-1;
            }
        }return false;
    }
}