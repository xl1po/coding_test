class Solution {
    public int solution(int[] arr) {
        int[] imsi = new int[arr.length];
        int answer = -1;
        
        
        while(true) {
            boolean isSame = true;
            for(int i=0; i<arr.length; i++) {
                if(imsi[i] != arr[i]) {
                    isSame = false;
                    break;
                }
            }
            if(isSame) break;
            
            for(int i=0; i<imsi.length; i++) {
                imsi[i] = arr[i];
            }
            for(int i=0; i<arr.length; i++) {
                if(arr[i] >= 50 && arr[i]%2 == 0) {
                    arr[i] /= 2;
                } else if(arr[i] < 50 && arr[i]%2 == 1) {
                    arr[i] = arr[i]*2 + 1;
                }
            }
            answer++;
        }
        
        return answer;
    }
}