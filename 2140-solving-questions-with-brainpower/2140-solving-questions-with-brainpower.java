class Solution {
    public long mostPoints(int[][] questions) {
        Map<String, Long> map = new HashMap<>();
        return helper(questions, 0, questions.length - 1, map);
    }
    private long helper(int[][] questions, int start, int end, Map<String, Long> map) {
        if (start > end) {
            return 0;
        }
        String key = String.valueOf(start + "," + end);
        if (map.containsKey(key)) {
            return map.get(key);
        }
		// answer the current question, skip next questions[i][1] questions
        long cur = questions[start][0] + helper(questions, start + questions[start][1] + 1, end, map);
		// do not answer the current question, go to next question
        long next = helper(questions, start + 1, end, map);
		
		// get the bigger result
        long res = Math.max(cur, next);
		// save it into map to save time
        map.put(key, res);
        return res;
    }
}