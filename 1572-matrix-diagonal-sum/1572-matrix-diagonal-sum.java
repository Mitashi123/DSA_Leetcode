class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int row = 0; row < mat.length; row++){
            sum += mat[row][row];
            
            // for odd matrix
            // if idx of rows != idx of cols
            if (row != mat.length - row - 1)
                sum += mat[row][mat.length - row - 1];
        }
        return sum;
    }
}