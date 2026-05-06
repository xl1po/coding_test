class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] suffix = new String[my_string.length()];
        
        for(int i=0; i<suffix.length; i++) {
            suffix[i] = my_string.substring(i, my_string.length());
        }
        for(int i=0; i<suffix.length; i++) {
            if(is_suffix.equals(suffix[i])) {
                answer = 1;
            }
        }
        
        return answer;
    }
}