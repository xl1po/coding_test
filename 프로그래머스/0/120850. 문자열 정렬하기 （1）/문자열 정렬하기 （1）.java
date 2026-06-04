import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] arr = new int[my_string.length()];
        int cnt = 0;
        
        for(int i=0; i<my_string.length(); i++) {
            if(my_string.charAt(i) - '0' >= 0 && my_string.charAt(i) - '0' <= 9) {
                arr[cnt] = (int) (my_string.charAt(i) - '0');
                cnt++;
            }
        }
        
        int[] answer = new int[cnt];
        
        for(int i=0; i<cnt; i++) {
            answer[i] = arr[i];
        }
        Arrays.sort(answer);
        
        return answer;
    }
}