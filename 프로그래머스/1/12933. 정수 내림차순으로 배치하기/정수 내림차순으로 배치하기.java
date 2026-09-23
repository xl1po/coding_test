import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        
        Arrays.sort(chars);
        
        StringBuilder sb = new StringBuilder(new String(chars));
        sb.reverse();
        
        return Long.parseLong(sb.toString());
    }
}