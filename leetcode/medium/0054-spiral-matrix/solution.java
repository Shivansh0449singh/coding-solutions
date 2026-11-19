class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = 0;
        int top = 0;
        int left = 0;
        int right = n - 1;
        int bottom = m - 1;
        while (top <= bottom && left <= right) {
            for (j = left; j <= right; j++) {
                ans.add(matrix[top][j]);
            }
            top++;

            for (i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (j = right; j >= left; j--) {
                    ans.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if (left <= right) {
                for (i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }

        }
        return ans;
    }
}