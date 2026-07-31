import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = new int[k];
        
        list.add(arr[0]);
        answer[0] = arr[0];
        int len = 1;
        for(int i=1; i<arr.length && len < k; i++) {
            if(!list.contains(arr[i])) {
                list.add(arr[i]);
                answer[len++] = arr[i];
            }
        }
        for(int i=len; i<k; i++) {
            answer[i] = -1;
        }
        
        return answer;
    }
}