class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer;
        int[] arr = new int[intStrs.length];
        int cnt = 0;
        
        for(int i=0; i<intStrs.length; i++) {
            String num = intStrs[i].substring(s, s+l);
            int mul = 1;
            int number = 0;
            for(int j=l-1 ; j>=0; j--) {
                number += (int)(num.charAt(j) - '0') * mul;
                mul *= 10;
            }
            if(number > k) {
                arr[cnt] = number;
                cnt++;
            }
        }
        
        answer = new int[cnt];
        for(int i=0; i<cnt; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}