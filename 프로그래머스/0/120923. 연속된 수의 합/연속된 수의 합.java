class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int sum = 0;
        
        for(int i=0; i<num; i++) {
            answer[i] = num+i;
            sum += answer[i];
        }
        
        while(sum > total) {
            for(int i=0; i<num; i++) {
                answer[i]--;
            }
            sum -= num;
        }
        while(sum < total) {
            for(int i=0; i<num; i++) {
                answer[i]++;
            }
            sum += num;
        }
        
        
        return answer;
    }
}