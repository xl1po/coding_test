class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int oddSum = 0;
        int evenSum = 0;
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2 == 0) {
                oddSum = oddSum*10 + num_list[i];
            }
            else {
                evenSum = evenSum*10 + num_list[i];
            }
        }
        
        answer = oddSum + evenSum;
        
        return answer;
    }
}