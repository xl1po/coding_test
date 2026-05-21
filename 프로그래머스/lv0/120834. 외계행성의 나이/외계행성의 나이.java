class Solution {
    public String solution(int age) {
        String answer = "";
        String imsi = "";
        
        for(int i=10; age>0; ) {
            imsi += (char) (age%i +'a');
            
            age /= 10;
        }
        for(int i=imsi.length() - 1; i>=0; i--) {
            answer += imsi.charAt(i);
        }
        
        
        return answer;
    }
}