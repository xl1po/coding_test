class Solution {
    public int solution(int[] sides) {
        int answer = 1;
        
        int max = sides[0];
        int length = max;

        for(int i=1; i<sides.length; i++) {
            if(max < sides[i]) {
                max = sides[i];
            }
            else {
                length += sides[i];
            }
        }
        if(max >= length) answer = 2;
        
        return answer;
    }
}