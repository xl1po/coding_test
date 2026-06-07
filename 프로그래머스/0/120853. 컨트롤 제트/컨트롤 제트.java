class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String num = "";
        int preNum = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                if(s.charAt(i-1) != 'Z') {
                    preNum = Integer.parseInt(num);
                    answer += preNum;
                    num = "";
                }
            }
            else if(s.charAt(i) == 'Z') {
                answer -= preNum;
                preNum = 0;
                num = "";
            }
            else {
                num += s.charAt(i);
            }
        }
        if(!num.equals("")) {
            preNum = Integer.parseInt(num);
            answer += preNum;
        }
        
        return answer;
    }
}