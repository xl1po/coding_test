class Solution {
    public int solution(int[][] dots) {
        int len1 = 0;
        int len2 = 0;
        for(int i=0; i<dots.length; i++) {
            for(int j=i+1; j<dots.length; j++) {
                if(dots[i][0] == dots[j][0]){
                    if(len1 < Math.abs(dots[i][1]-dots[j][1]))len1 = Math.abs(dots[i][1]-dots[j][1]);
                }
                else if(dots[i][1] == dots[j][1]) {
                    if(len2 < Math.abs(dots[i][0]-dots[j][0]))len2 = Math.abs(dots[i][0]-dots[j][0]);
                }
            }
        }
        
        int answer = len1*len2;
        return answer;
    }
}