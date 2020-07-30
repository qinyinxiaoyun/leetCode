package com.binarySearch;

public class P240Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0)return false;
        int row = matrix.length - 1, col = 0;
        while (row >= 0 && col < matrix[0].length){
            int a = matrix[row][col];
            if (target == a)return true;
            if (target > a)col += 1;
            else row -= 1;
        }
        return false;
    }
}
