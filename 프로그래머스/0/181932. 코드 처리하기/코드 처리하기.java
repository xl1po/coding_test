class Solution {
    public String solution(String code) {
        String answer = "";
        
        String ret = "";
        boolean mode = false;
        for(int index=0; index<code.length(); index++){
            if(code.charAt(index) == '1') {
                mode = !mode;
                continue;
            }
            if(mode == false){
                if(index % 2 ==0) {
                    ret += code.charAt(index);
                }
            }
            else {
                if(index % 2 == 1) {
                    ret += code.charAt(index);
                }
            }
        }
        if(ret.length() == 0) {
            answer += "EMPTY";
        }
        else {
            answer += ret;
        }
        
        return answer;
    }
}