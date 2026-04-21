class Solution {
    public int[] solution(int l, int r) {
        int[] answer;
        int[] arr = new int[r];
        
        boolean t;
        int cnt = 0;
        for(int i=l; i<=r; i++) {
            t = true;
            int s = i;
            for(; s > 0;) {
                if(s%10 != 5 && s%10 != 0) {
                    t = false;
                    break;
                }
                s /= 10;
            }
            if(t) {
                arr[cnt] = i;
                cnt++;
            }
        }
        
        if(cnt == 0) {
            arr[0] = -1;
            cnt++;
        }
        answer = new int[cnt];
        for(int i=0; i<cnt; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}