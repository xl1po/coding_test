class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String imsi = "";
        for(int i=0; i<letter.length(); i++) {
            if(letter.charAt(i) == ' ') {
                for(int j=0; j<morse.length; j++) {
                    if(imsi.equals(morse[j])) {
                        answer += (char) (j + 'a');
                        break;
                    }
                }
                imsi = "";
                continue;
            }
            imsi += letter.charAt(i);
        }
        for(int j=0; j<morse.length; j++) {
            if(imsi.equals(morse[j])) {
                answer += (char) (j + 'a');
                break;
            }
        }
        
        return answer;
    }
}