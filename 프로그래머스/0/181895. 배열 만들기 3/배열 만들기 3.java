class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a1 = intervals[0][0];
        int a2 = intervals[1][0];
        int b1 = intervals[0][1];
        int b2 = intervals[1][1];
        
        int len1 = b1 - a1 + 1;
        int len2 = b2 - a2 + 1;
        
        int[] answer = new int[len1 + len2];
        
        for(int i=0; i<len1; i++) {
            answer[i] = arr[a1 + i];
        }
        for(int j=0; j<len2; j++) {
            answer[len1 + j] = arr[a2 + j];
        }
        
        return answer;
    }
}