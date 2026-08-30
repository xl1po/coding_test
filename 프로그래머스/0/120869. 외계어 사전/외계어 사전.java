class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(int i=0; i<dic.length; i++) {
            if(dic[i].length() == spell.length) {
                boolean cont = true;
                for(int j=0; j<spell.length; j++) {
                    if(!dic[i].contains(spell[j])) {
                        cont = false;
                        break;
                    }
                }
                if(cont) {
                    answer = 1;
                    break;
                }
            }
        }
        
        return answer;
    }
}