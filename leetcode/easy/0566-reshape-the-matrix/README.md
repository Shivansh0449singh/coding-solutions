# Reshape the Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

In MATLAB, there is a handy function called `reshape` which can reshape an `m x n` matrix into a new one with a different size `r x c` keeping its original data.

You are given an `m x n` matrix `mat` and two integers `r` and `c` representing the number of rows and the number of columns of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the `reshape` operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

 

Original
Java
 **Example 1:** 

```
Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]

```

 **Example 2:** 

```
Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]

```

 

 **Constraints:** 

- m == mat.length
- n == mat[i].length
- 1 <= m, n <= 100
- -1000 <= mat[i][j] <= 1000
- 1 <= r, c <= 300

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 79.46%)  
**Memory:** 47.1 MB (beats 53.58%)  
**Submitted:** 2026-11-19T18:30:41.769Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/reshape-the-matrix/)