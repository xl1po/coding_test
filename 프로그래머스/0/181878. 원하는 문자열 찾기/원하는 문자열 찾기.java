class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        boolean isContain = myString.contains(pat);
        
        if(isContain) answer = 1;
        
        return answer;
    }
}