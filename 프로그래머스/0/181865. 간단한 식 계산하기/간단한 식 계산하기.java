class Solution {
    public int solution(String binomial) {
        String a = "";
        String b = "";
        char op = '+';
        
        for(int i=0; i<binomial.length(); i++) {
            if(binomial.charAt(i) == '+') {
                op = '+';
                b = binomial.substring(i + 2);
                break;
            } else if(binomial.charAt(i) == '-') {
                op = '-';
                b = binomial.substring(i + 2);
                break;
            } else if(binomial.charAt(i) == '*') {
                op = '*';
                b = binomial.substring(i + 2);
                break;
            }
            if(binomial.charAt(i) != ' ') {
                a += binomial.charAt(i);
            }
        }
        
        int answer = 0;
        if(op == '+') answer = Integer.parseInt(a) + Integer.parseInt(b);
        else if(op == '-') answer = Integer.parseInt(a) - Integer.parseInt(b);
        else if(op == '*') answer = Integer.parseInt(a) * Integer.parseInt(b);
        
        return answer;
    }
}