import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            boolean delete = false;
            for(int j=0; j<delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    delete = true;
                    break;
                }
            }
            if(!delete) list.add(arr[i]);
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}