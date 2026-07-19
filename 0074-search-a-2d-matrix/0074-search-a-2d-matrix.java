class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;       // number of rows
        int m = matrix[0].length;    // number of columns
        int i=0, j=m-1;
        while (i<n && j>=0) {
            if (matrix[i][j] == target) {
                return true;
            }
            if (matrix[i][j] >= target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}