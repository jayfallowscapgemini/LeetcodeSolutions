/* You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation. */

class Solution {
    public void rotate(int[][] matrix) { // 2D array
        int n = matrix.length; 
        for (int i = 0; i < n; i++) { // two pointer iterations (r, c) 
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j]; // set temp var for flipping positions
                matrix[i][j] = matrix[j][i]; // flip positions
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < (n / 2); j++) { // move to middle position
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j]; // do same for middle 
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
}
