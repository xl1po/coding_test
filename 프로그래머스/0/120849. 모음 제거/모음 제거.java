class Solution {
    public String solution(String my_string) {
        char[] letter = {'a', 'e', 'i', 'o', 'u'};
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++) {
            boolean let = false;
            for(int j=0; j<letter.length; j++) {
                if(my_string.charAt(i) == letter[j]) {
                    let = true;
                    break;
                }
            }
            if(!let) {
                answer += my_string.charAt(i);
            }
        }
        
        
        return answer;
    }
}