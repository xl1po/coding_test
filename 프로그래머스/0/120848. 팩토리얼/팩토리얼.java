class Solution {
    public int solution(int n) {
        int answer = 0;
        int fac = 1;
        
        for(int i=1; fac<=n; i++) {
            fac *= i;
            answer = i - 1;
        }
        
        return answer;
    }
}