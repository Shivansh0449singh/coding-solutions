# Spiral Matrix II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a positive integer `n`, generate an `n x n` `matrix` filled with elements from `1` to `n2` in spiral order.

 

Original
Java
 **Example 1:** 

```
Input:int n = 3;Output: [[1,2,3],[8,9,4],[7,6,5]]

```

 **Example 2:** 

```
Input:int n = 1;Output: [[1]]

```

 

 **Constraints:** 

- 1 <= n <= 20

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.1 MB (beats 95.72%)  
**Submitted:** 2026-11-19T18:25:09.598Z  

```java
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

```

---

[View on LeetCode](https://leetcode.com/problems/spiral-matrix-ii/)