class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = 1;
        }
        for(int i=0; i<answer.length; i++) {
            for(int j=0; j<i; j++) {
                if(emergency[i] > emergency[j]) {
                    answer[j] += 1;
                }
                else {
                    answer[i] += 1;
                }
            }
        }
        
        return answer;
    }
}