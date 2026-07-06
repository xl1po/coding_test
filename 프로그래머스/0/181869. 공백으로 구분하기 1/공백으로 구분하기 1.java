class Solution {
    public String[] solution(String my_string) {
        int space = 0;
        
        for(int i=0; i<my_string.length(); i++) {
            if(my_string.charAt(i) == ' ') space++;
        }
        
        
        String[] answer = new String[space+1];
        space = 0;
        
        String imsi = "";
        for(int i=0; i<my_string.length(); i++) {
            if(my_string.charAt(i) != ' ') {
                imsi += my_string.charAt(i);
            } else {
                answer[space] = imsi;
                space++;
                imsi = "";
            }
        }
        answer[space] = imsi;
        
        
        return answer;
    }
}