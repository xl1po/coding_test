class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(; i<=j; i++) {
            for(int a=i; a>0; a/=10) {
                if(a%10 == k) answer++;
            }
        }
        
        return answer;
    }
}