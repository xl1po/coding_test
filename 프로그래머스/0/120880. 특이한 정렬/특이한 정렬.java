import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        
        int nLoc = 0;
        int nDiff = 100000;
        for(int i=0; i<numlist.length; i++) {
            if(Math.abs(n - numlist[i]) < nDiff) {
                nDiff = Math.abs(n - numlist[i]);
                nLoc = i;
            }
        }
        
        int[] answer = new int[numlist.length];
        
        int loc = 0;
        answer[loc++] = numlist[nLoc];
        int a = nLoc+1;
        int b = nLoc-1;
        
        while(a < numlist.length && b >= 0) {
            if(Math.abs(n-numlist[a]) > Math.abs(n-numlist[b])) {
                answer[loc++] = numlist[b--];
            } else {
                answer[loc++] = numlist[a++];
            }
        }
        
        while(a < numlist.length) {
            answer[loc++] = numlist[a++];
        }
        while(b >= 0) {
            answer[loc++] = numlist[b--];
        }
        
        return answer;
    }
}