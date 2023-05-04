class Solution {
    public int lengthOfLongestSubstring(String s) {
         int n = s.length();
				 if(n==0)
				 	return 0;
        int max = 1;
        for(int i=0; i<n-1;i++) {
        	Set<Character> set = new HashSet<>();
        	for(int j=i; j<n; j++) {
        		if(set.contains(s.charAt(j))) {
        			max = Math.max(max, set.size());
        			break;
        		}
        		set.add(s.charAt(j));
        	}
        	max = Math.max(max, set.size());
        }
        return max;
    }
}