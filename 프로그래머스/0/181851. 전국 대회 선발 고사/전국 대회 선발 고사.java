class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        for(int i=0; i<rank.length; i++) {
            if(!attendance[i]) {
                rank[i] = 0;
            }
        }
        
        int answer = 0;
        
        for(int j=10000; j>0; j/=100) {
            int idx = 0;
            int min = 1000;
            for(int i=0; i<rank.length; i++) {
                if(rank[i] != 0 && min > rank[i]) {
                    min = rank[i];
                    idx = i;
                }
            }
            rank[idx] = 0;
            answer += j*idx;
        }
        
        return answer;
    }
}