import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        String nums = Arrays.toString(array);
        int answer = 0;
        for(int i=0; i<nums.length(); i++) {
            if(nums.charAt(i) == '7') answer++;
        }
        return answer;
    }
}