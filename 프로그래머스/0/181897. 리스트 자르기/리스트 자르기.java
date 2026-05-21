class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer;
        int[] arr = new int[num_list.length];
        int j = slicer[1];
        
        if(n == 1) {
            for(int i=0; i<slicer[1] + 1; i++) {
                arr[i] = num_list[i];
                j = i;
            }
        }
        else if(n == 2) {
            for(int i=0; i<num_list.length - slicer[0]; i++) {
                arr[i] = num_list[i + slicer[0]];
                j = i;
            }
        }
        else if(n == 3) {
            for(int i=0; i<slicer[1] - slicer[0] + 1; i++) {
                arr[i] = num_list[i + slicer[0]];
                j = i;
            }
        }
        else if(n == 4) {
            for(int i=0; i<(slicer[1] - slicer[0])/slicer[2] + 1; i++) {
                arr[i] = num_list[i*slicer[2] + slicer[0]];
                j = i;
            }
        }
        answer = new int[j + 1];
        for(int i=0; i<answer.length; i++) {
            answer[i] = arr[i];
        }
        
        
        return answer;
    }
}