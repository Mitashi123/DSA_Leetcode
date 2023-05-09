class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = n - 1, top = 0, bottom = m - 1;
        while (result.size() < m * n) {
            // Traverse right
            for (int j = left; j <= right && result.size() < m * n; j++) {
                result.add(matrix[top][j]);
            }
            // Traverse down
            for (int i = top + 1; i <= bottom - 1 && result.size() < m * n; i++) {
                result.add(matrix[i][right]);
            }
            // Traverse left
            for (int j = right; j >= left && result.size() < m * n; j--) {
                result.add(matrix[bottom][j]);
            }
            // Traverse up
            for (int i = bottom - 1; i >= top + 1 && result.size() < m * n; i--) {
                result.add(matrix[i][left]);
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return result;
    }
}