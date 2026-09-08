class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        int[] a = new int[26];
        int[] b = new int[26];
        
        for(int i=0; i<after.length(); i++) {
            a[(int)(after.charAt(i)-'a')]++;
        }
        for(int i=0; i<before.length(); i++) {
            b[(int)(before.charAt(i)-'a')]++;
        }
        
        for(int i=0; i<a.length; i++) {
            if(a[i] != b[i]){
                answer = 0;
                break;
            }
        }
        
        return answer;
    }
}