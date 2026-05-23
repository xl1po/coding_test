class Solution {
    public int[] solution(int[] arr) {
        
        int start=-1;
        int len=1;
        for(int i=0; i<arr.length; i++) {
            if(start == -1 && arr[i] == 2) {
                start = i;
            }
            else if(start != -1 && arr[i] == 2) {
                len = i - start + 1;
            }
        }
        int[] answer = new int[len];
        
        if(start == -1) {
            answer[0] = start;
        }
        else {
            System.arraycopy(arr, start, answer, 0, len);
        }
        
        return answer;
    }
}