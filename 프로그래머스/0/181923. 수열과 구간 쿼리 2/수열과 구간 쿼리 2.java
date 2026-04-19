class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++){
            int least = -1;
            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                if(arr[j] > queries[i][2]) {
                    if(least == -1) {
                        least = arr[j];
                    }
                    else if(least != -1 && least > arr[j]){
                        least = arr[j];
                    }
                }
            }
            answer[i] = least;
        }
        
        return answer;
    }
}