class Solution {
    long dp[];
    long mod=1000000007;
    public int countGoodStrings(int low, int high, int zero, int one) {
        dp = new long[high+1];
        dp[0] = 1;
        for(int i=1;i<=high;i++){
            if((i-one)>=0){
                dp[i] = (dp[i] + dp[i-one])%mod;
            }
            if((i-zero)>=0){
                dp[i] = (dp[i]+dp[i-zero])%mod;
            }
        }
        long ans=0;
        for(int i=low;i<=high;i++){
            ans = (ans+dp[i])%mod;
        } 
       return (int)ans;
    }

}