class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = new int[arr.length];
        
        for(int i=0; i<query.length; i++) {
            if(i%2 == 0) {
                answer = new int[query[i] + 1];
                for(int j=0; j<answer.length; j++) {
                    answer[j] = arr[j];
                }
            }
            else {
                answer = new int[arr.length - query[i]];
                for(int j=0; j<answer.length; j++) {
                    answer[j] = arr[j+query[i]];
                }
            }
            arr = new int[answer.length];
            for(int j=0; j<answer.length; j++) {
                arr[j] = answer[j];
            }
        }
        
        return answer;
    }
}