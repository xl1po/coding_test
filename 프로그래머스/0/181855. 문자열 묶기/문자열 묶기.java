import java.util.Arrays;

class Solution {
    public int solution(String[] strArr) {
        int[] len = new int[100000];
        for(int i=0; i<strArr.length; i++) {
            len[strArr[i].length()]++;
        }
        Arrays.sort(len);
        
        int answer = len[99999];
        return answer;
    }
}