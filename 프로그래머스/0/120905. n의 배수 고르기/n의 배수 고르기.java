import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i]%n == 0) numbers.add(numlist[i]);
        }
        
        int[] answer = numbers.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}