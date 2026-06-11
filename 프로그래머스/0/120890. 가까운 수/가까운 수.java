class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int close = 100;
        
        for(int i=0; i<array.length; i++) {
            if(n > array[i]) {
                if(close == n-array[i]) {
                    answer = array[i];
                }
                else if(close > n-array[i]) {
                    close = n-array[i];
                    answer = array[i];
                }
            }
            else if(n < array[i]){
                if(close > array[i]-n) {
                    close = array[i]-n;
                    answer = array[i];
                }
            }
            else {
                answer = n;
                break;
            }
        }
        
        
        return answer;
    }
}