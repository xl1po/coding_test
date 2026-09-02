class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] l = new int[201];
        
        for(int i=0; i<lines.length; i++) {
            int a = lines[i][0];
            int b = lines[i][1];
            for(int j=a; j<b; j++) {
                l[j+100]++;
            }
        }
        
        for(int i=0; i<l.length; i++) {
            if(l[i] >= 2) answer++;
        }
        
        return answer;
    }
}