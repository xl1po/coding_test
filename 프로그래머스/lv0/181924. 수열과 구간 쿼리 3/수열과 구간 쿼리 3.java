class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for(int i=0; i<queries.length; i++) {
            int imsi;
            imsi = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = imsi;
        }
        
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i];
        }
        
        return answer;
    }
}