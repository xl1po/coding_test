class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String imsi = "0";
        
        for(int i=0; i<my_string.length(); i++) {
            char c = my_string.charAt(i);
            if((int)(c-'0') >= 0 && (int)(c-'0') <= 9) imsi += c;
            else {
                answer += Integer.parseInt(imsi);
                imsi = "0";
            }
        }
        answer += Integer.parseInt(imsi);
        
        
        return answer;
    }
}