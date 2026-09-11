class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int pRm = common[1]-common[0];
        boolean plus = false;
        for(int i=1; i<common.length; i++) {
            if(pRm != common[i] - common[i-1]) {
                plus = true;
            }
        }
        answer = common[common.length-1]+pRm;
        if(plus) {
            pRm = common[1]/common[0];
            answer = common[common.length-1]*pRm;
        }
        
        return answer;
    }
}