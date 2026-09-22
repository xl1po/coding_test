class Solution {
    public int[] solution(long n) {
        int[] imsi = new int[12];
        int len = 0;

        for(; n>0; n/=10) {
            imsi[len++] = (int)(n%10);
        }

        int[] answer = new int[len];
        for(int i=0; i<len; i++) {
            answer[i] = imsi[i];
        }
        
        
        return answer;
    }
}