import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList<>();
        
        String imsi = "";
        for(int i=0; i<myStr.length(); i++) {
            if(myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c') {
                if(!imsi.equals("")) {
                    list.add(imsi);
                    imsi = "";
                }
            } else {
                imsi += myStr.charAt(i);
            }
        }
        if(!imsi.equals("")) {
            list.add(imsi);
        }
        if(list.isEmpty()) list.add("EMPTY");
        
        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}