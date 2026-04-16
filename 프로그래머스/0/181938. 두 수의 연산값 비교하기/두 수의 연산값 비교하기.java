class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int i;
        for(i=1; b/i > 0; i*=10){
            
        }
        int ab = (a * i) + b;
        int ab2 = 2 * a * b;
        
        if(ab >= ab2) {
            answer = ab;
        }
        else {
            answer = ab2;
        }
        
        return answer;
    }
}