class Solution {
    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        int row = 0;
        boolean goingDown = true;
        for (char ch : s.toCharArray()) {
            rows[row].append(ch);
            if (goingDown) {
                row++;
                if (row == numRows) {
                    row = numRows - 2;
                    goingDown = false;
                }
            } else {
                row--;
                if (row == -1) {
                    row = 1;
                    goingDown = true;
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder r : rows) {
            ans.append(r);
        }
        return ans.toString();
    }
}