class Solution {
    public int arraySign(int[] nums) {
        
        boolean negcount = true;
        for(Integer num: nums){
            if(num == 0) return 0;
            negcount = (num < 0) ? !negcount : negcount;
        }
        return negcount ? 1 : -1;
    }
}