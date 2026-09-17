class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] babble = {"aya", "ye", "woo", "ma"};
        
        for (String s : babbling) {
            for (String b : babble) {
                s = s.replace(b, " ");
            }
            
            if (s.replace(" ", "").isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
}