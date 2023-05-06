class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length()==0){
            return "";
        }
        String longest = "";
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int j = 0; j<s.length(); j++){
            for( int i =0; i<=j; i++){
                boolean isPalidrome = s.charAt(i)==s.charAt(j);
                if(j-i<2){
                    dp[i][j] = isPalidrome;
                }else{
                    dp[i][j] = isPalidrome && dp[i+1][j-1];
                }
                if(dp[i][j] && j-i+1 > longest.length()){
                    longest = s.substring(i, j+1);
                }
            }
        }
        return longest;
    }
}