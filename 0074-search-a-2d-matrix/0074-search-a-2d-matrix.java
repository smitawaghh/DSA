class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;       // number of rows
        int m = matrix[0].length;    // number of columns
        int i=0, j=m-1;
        int low=0, high = (m*n-1);
        while (low<=high) {
            int mid = (low+high)/2;
            int row = mid/m;
            int col = mid%m;
            if (matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] > target) {
                high = mid-1;
            } else {
                low= mid+1;
            }
        }
        return false;
    }
    
}