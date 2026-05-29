class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int x = box[0];
        int y = box[1];
        int z = box[2];
        
        answer = (x/n) * (y/n) * (z/n);
        
        return answer;
    }
}