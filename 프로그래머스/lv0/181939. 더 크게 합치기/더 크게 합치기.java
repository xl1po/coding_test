class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int ab;
        int ba;
        int i;
        for(i=1; b/i > 0; i*=10) {
            
        }
        ab = (a * i) + b;
        for(i=1; a/i > 0; i*=10) {
            
        }
        ba = (b * i) + a;
        
        if(ab >= ba) {
            answer = ab;
        }
        else {
            answer = ba;
        }
        
        return answer;
    }
}