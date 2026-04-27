class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        
        for(int i=0; i<queries.length; i++) {
            StringBuffer sb = new StringBuffer(my_string);
            String reverse = "";
            for(int j=queries[i][1]; j>=queries[i][0]; j--) {
                reverse += my_string.charAt(j);
            }
            sb = sb.replace(queries[i][0], queries[i][1] + 1, reverse);
            my_string = sb.toString();
            
        }
        answer = my_string;
        
        return answer;
    }
}