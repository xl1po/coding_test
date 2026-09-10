class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        while(chicken > 0) {
            if(chicken/10 != 0) {
                chicken -= 10;
                answer++;
                chicken++;
            }
            else break;
        }
        
        return answer;
    }
}