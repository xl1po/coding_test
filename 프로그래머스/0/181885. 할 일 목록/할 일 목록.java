class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int falseCount = 0;
        
        for(int i=0; i<finished.length; i++) {
            if(!finished[i]) {
                falseCount++;
            }
        }
        
        String[] answer = new String[falseCount];
        
        int cnt = 0;
        for(int i=0; i<finished.length; i++) {
            if(!finished[i]) {
                answer[cnt] = todo_list[i];
                cnt++;
            }
        }
        
        return answer;
    }
}