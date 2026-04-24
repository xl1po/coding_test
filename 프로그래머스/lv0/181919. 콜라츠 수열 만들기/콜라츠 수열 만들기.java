class Solution {
    public int[] solution(int n) {
        int[] answer;
        int[] arr = new int[1000];
        
        int cnt = 1;
        arr[0] = n;
        while(n!=1) {
            if(n%2 == 0) {
                arr[cnt] = n/2;
                n /= 2;
            }
            else {
                arr[cnt] = 3*n + 1;
                n = 3*n + 1;
            }
            cnt++;
        }
        answer = new int[cnt];
        for(int i=0; i<cnt; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}