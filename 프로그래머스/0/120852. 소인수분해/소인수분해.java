import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        
        int arr[] = new int[100];
        int cnt = 0;
        
        for(int i=2; n>1 ;i++) {
            if(n%i == 0) {
                n /= i;
                arr[cnt] = i;
                cnt++;
                i=1;
            }
        }
        
        
        int[] newArr = Arrays.stream(arr).distinct().toArray();
        int[] answer = new int[newArr.length - 1];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = newArr[i];
        }
        
        return answer;
    }
}