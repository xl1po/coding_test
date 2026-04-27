class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        for(int i=1;;i++) {
            if(i%denom1 == 0 && i%denom2 == 0) {
                answer[1] = i;
                break;
            }
        }
        answer[0] = numer1*(answer[1]/denom1) + numer2*(answer[1]/denom2);
        
        for(int i=answer[1]; i > 1; i--) {
            if(answer[0]%i == 0 && answer[1]%i == 0) {
                answer[0] /= i;
                answer[1] /= i;
            }
        }
        
        return answer;
    }
}