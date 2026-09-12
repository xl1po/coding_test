class Solution {
    public int solution(int M, int N) {
        int mn = Math.min(M, N);
        int mx = Math.max(M, N);
        int answer = mn-1 + (mx-1)*mn;
        return answer;
    }
}