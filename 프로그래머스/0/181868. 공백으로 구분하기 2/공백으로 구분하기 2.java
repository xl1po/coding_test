class Solution {
    public String[] solution(String my_string) {
        int space = 0;
        my_string = my_string.strip();
        for(int i=0; i<my_string.length() - 1; i++) {
            if(my_string.charAt(i+1) == ' ' && my_string.charAt(i) != ' ') space++;
        }
        space++;
        
        String[] answer = new String[space];
        
        space = 0;
        String imsi = "";
        for(int i=0; i<my_string.length(); i++) {
            if(my_string.charAt(i) != ' ') {
                imsi += my_string.charAt(i);
            } else if(my_string.charAt(i) == ' ' && my_string.charAt(i+1) != ' ') {
                answer[space] = imsi;
                space++;
                imsi = "";
            }
        }
        answer[space] = imsi;
        
        return answer;
    }
}