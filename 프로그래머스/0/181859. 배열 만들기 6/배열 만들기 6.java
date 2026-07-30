import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        
        int len = 0;
        for(int i=0; i<arr.length; i++) {
            if(stk.isEmpty()) {
                stk.add(arr[i]);
                len++;
            }
            else {
                if(stk.get(len-1) == arr[i]) {
                    stk.remove(len-1);
                    len--;
                } else {
                    stk.add(arr[i]);
                    len++;
                }
            }
        }
        if(stk.isEmpty()) stk.add(-1);
        
        int[] answer = stk.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}