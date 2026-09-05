class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        for(int i=0; i<db.length; i++) {
            if(db[i][0].equals(id_pw[0])) {
                if(answer.isEmpty() && !db[i][1].equals(id_pw[1])) answer = "wrong pw";
                else if(db[i][1].equals(id_pw[1])) {
                    answer = "login";
                    break;
                }
            }
        }
        if(answer.isEmpty()) answer = "fail";
        
        return answer;
    }
}