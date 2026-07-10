import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {
        String[] splitArr = myString.split("x", -1);
        
        
        ArrayList<String> list = new ArrayList<>();
        for (String s : splitArr) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }
        
        String[] answer = list.toArray(new String[0]);
        
        Arrays.sort(answer);
        
        return answer;
    }
}