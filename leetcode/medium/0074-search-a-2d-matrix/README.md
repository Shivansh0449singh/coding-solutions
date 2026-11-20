# Search a 2D Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an `m x n` integer matrix `matrix` with the following two properties:

- Each row is sorted in non-decreasing order.
- The first integer of each row is greater than the last integer of the previous row.

Given an integer `target`, return `true`  *if*  `target`  *is in*  `matrix`  *or*  `false`  *otherwise*.

You must write a solution in `O(log(m * n))` time complexity.

 

Original
Java
 **Example 1:** 

```
Input:int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};int target = 3;Output: true

```

 **Example 2:** 

```
Input:int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};int target = 13;Output: false

```

 

 **Constraints:** 

- m == matrix.length
- n == matrix[i].length
- 1 <= m, n <= 100
- -104 <= matrix[i][j], target <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.9 MB (beats 99.05%)  
**Submitted:** 2026-11-20T04:29:47.421Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/search-a-2d-matrix/)