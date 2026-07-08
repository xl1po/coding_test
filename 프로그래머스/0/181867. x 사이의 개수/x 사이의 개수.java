class Solution {
    public int[] solution(String myString) {
        int cntX = 0;
        for(int i=0; i<myString.length(); i++) {
            if(myString.charAt(i) == 'x') cntX++;
        }
        
        int[] answer = new int[cntX + 1];
        cntX = 0;
        int cnt = 0;
        for(int i=0; i<myString.length(); i++) {
            if(myString.charAt(i) == 'x') {
                answer[cntX++] = cnt;
                cnt = 0;
            }
            else cnt++;
        }
        answer[cntX] = cnt;
        
        return answer;
    }
}