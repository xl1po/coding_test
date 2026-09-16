class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        while(!A.equals(B)) {
            if(answer > A.length()) {
                answer = -1;
                break;
            }
            A = A.substring(A.length()-1) + A.substring(0, A.length()-1);
            answer++;
        }
        
        return answer;
    }
}