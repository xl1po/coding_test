class Solution {
    public String solution(String my_string) {
        String answer = "";
        String dup = "";
        
        for(int i=0; i<my_string.length(); i++) {
            boolean isDup = false;
            for(int j=0; j<dup.length(); j++) {
                if(my_string.charAt(i) == dup.charAt(j)) {
                    isDup = true;
                    break;
                }        
            }
            if(!isDup) {
                answer += my_string.charAt(i);
                dup += my_string.charAt(i);
            }
        }
        
        
        return answer;
    }
}