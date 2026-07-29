import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int len = 0;
        for(int i=0; i<arr.length; i++) {
            if(flag[i]) {
                for(int j=0; j<arr[i]*2; j++) {
                    list.add(arr[i]);
                    len++;
                }
            } else {
                for(int j=0; j<arr[i]; j++) {
                    list.remove(len-1);
                    len--;
                }
            }
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}