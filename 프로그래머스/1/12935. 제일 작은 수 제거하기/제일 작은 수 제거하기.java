import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        int idx = 0;
        for(int i=0; i<arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
                idx = i;
            }
        }
        
        int[] answer = new int[arr.length-1];
        int cnt = 0;
        for(int i=0; i<arr.length; i++) {
            if(i == idx) continue;
            answer[cnt++] = arr[i];
        }
        if(arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}