class Solution {
    public String[] solution(String[] str_list) {
        
        int length = 0;
        String LR = "";
        boolean found = false;
        
        for(int i=0; i<str_list.length; i++) {
            if(str_list[i].equals("l") || str_list[i].equals("r")) {
                length = i;
                LR += str_list[i];
                found = true;
                break;
            }
        }
        
        String[] answer = new String[length];
        
        if(!found) {
            return new String[0];
        }
        
        if(LR.equals("l")) {
            answer = new String[length];
            for(int i=0; i<answer.length; i++) {
                answer[i] = str_list[i];
            }    
        }
        else if(LR.equals("r")) {
            answer = new String[str_list.length - length - 1];
            for(int i=0; i<answer.length; i++) {
                answer[i] = str_list[i + length + 1];
            }
        }
        
        return answer;
    }
}