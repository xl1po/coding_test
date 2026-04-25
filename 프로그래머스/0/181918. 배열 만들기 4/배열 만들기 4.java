class Solution {
    public int[] solution(int[] arr) {
        int[] stk;
        int[] imsi = new int[arr.length];
        
        int cnt = 0;
        
        for(int i=0; i<arr.length;) {
            if(imsi[0] == 0) {
                imsi[0] = arr[i];
                cnt++;
                i++;
            }
            if(imsi[cnt-1] != 0) {
                if(imsi[cnt-1] < arr[i]) {
                    imsi[cnt] = arr[i];
                    cnt++;
                    i++;
                }
                else if(imsi[cnt - 1] >= arr[i]) {
                    cnt--;
                    imsi[cnt] = 0;
                }
            }
            
        }
        stk = new int[cnt];
        for(int i=0; i<cnt; i++) {
            stk[i] = imsi[i];
        }
        
        return stk;
    }
}