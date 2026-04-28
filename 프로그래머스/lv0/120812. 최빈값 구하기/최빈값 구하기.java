import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[]cnt = new int[1000];
        int N = 0;
        int most_cnt = 0;
        
        for(int i=0; i<array.length; i++) {
            cnt[array[i]]++;
            if(array[i] > N) N = array[i];
        }
        for(int i=0; i<=N; i++) {
            if(most_cnt < cnt[i]){
                most_cnt = cnt[i];
                answer = i;
            }
        }
        Arrays.sort(cnt, 0, N+1);
        if(cnt[N-1] == cnt[N]) answer = -1; 
        
        return answer;
    }
}