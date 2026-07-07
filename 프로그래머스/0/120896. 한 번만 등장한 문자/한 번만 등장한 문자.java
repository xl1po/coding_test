class Solution {
    public String solution(String s) {
        int[] alpa = new int[26];
        
        for(int i=0; i<s.length(); i++) {
            alpa[(int)(s.charAt(i) - 'a')]++;
        }
        
        String answer = "";
        
        for(int i=0; i<alpa.length; i++) {
            if(alpa[i] == 1) {
                answer += (char)(i+'a');
            }
        }
        
        return answer;
    }
}