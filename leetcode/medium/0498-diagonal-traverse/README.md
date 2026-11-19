# Diagonal Traverse

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an `m x n` matrix `mat`, return  *an array of all the elements of the array in a diagonal order*.

 

Original
Java
 **Example 1:** 

```
Input:int[][] mat = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};Output: [1,2,4,7,5,3,6,8,9]

```

 **Example 2:** 

```
Input:int[][] mat = new int[][]{{1, 2}, {3, 4}};Output: [1,2,3,4]

```

 

 **Constraints:** 

- m == mat.length
- n == mat[i].length
- 1 <= m, n <= 104
- 1 <= m * n <= 104
- -105 <= mat[i][j] <= 105

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 73.91%)  
**Memory:** 47.5 MB (beats 85.89%)  
**Submitted:** 2026-11-19T17:09:10.096Z  

```java
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
                if(i==0 && j==n-1 ){
                    i++;
                }else if(i==0 && j<n-1){
                    j++;
                }else if(i>0 && j==n-1){
                    i++;
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
```

---

[View on LeetCode](https://leetcode.com/problems/diagonal-traverse/)