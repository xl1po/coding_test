class Solution {
    public int solution(int num, int k) {
        String numString = String.valueOf(num);
        
        int answer = -1;
        for(int i=0; i<numString.length(); i++) {
            if(numString.charAt(i) == (char)(k + '0')) {
                answer = i+1;
                break;
            }
        }
        
        return answer;
    }
}