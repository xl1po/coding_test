class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        int n = 0;
        int m = 0;

        int alen = a.length() - 1;
        int blen = b.length() - 1;
        String imsi = "";
        if(alen > blen) {
            for(;blen >= 0; blen--, alen--) {
                n = (int) (a.charAt(alen) - '0') + (int) (b.charAt(blen) - '0') + m;
                m = 0;
                if(n/10 == 1) m = 1;
                imsi += (char) ((n%10) + '0');
            }
            for(; alen>=0; alen--) {
                n = (int) (a.charAt(alen) - '0') + m;
                m = 0;
                if(n/10 == 1) m = 1;
                imsi += (char) ((n%10) + '0');
            }
            if(m == 1) {
                imsi += '1';
            }
        } else {
            for(;alen>=0; alen--,blen--) {
                n = (int) (a.charAt(alen) - '0') + (int) (b.charAt(blen) - '0') + m;
                m = 0;
                if(n/10 == 1) m = 1;
                imsi += (char) ((n%10) + '0');
            }
            for(;blen>=0; blen--) {
                n = (int) (b.charAt(blen) - '0') + m;
                m = 0;
                if(n/10 == 1) m = 1;
                imsi += (char) ((n%10) + '0');
            }
            if(m == 1) {
                imsi += '1';
            }
        }
        
        for(int i=imsi.length() - 1; i>=0; i--) {
            answer += imsi.charAt(i);
        }
        
        
        return answer;
    }
}