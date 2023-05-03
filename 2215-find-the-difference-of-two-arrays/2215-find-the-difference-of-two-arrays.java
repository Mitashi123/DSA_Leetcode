class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        answer.add(new ArrayList<>());
        
        int[] hm = new int[2001];

      
        for(int ele : nums1) hm[ele + 1000] = 1;
        for(int ele : nums2){
            if(hm[ele + 1000] == 1) hm[ele + 1000] = -1;
            
            else if(hm[ele + 1000] == 0){
                answer.get(1).add(ele);
                hm[ele + 1000] = -1;
            }
        }
        for(int i = 0 ; i <= 2000 ; i++){
            
            if(hm[i] == 1) answer.get(0).add(i - 1000);
        }

        return answer;
        
        }
}