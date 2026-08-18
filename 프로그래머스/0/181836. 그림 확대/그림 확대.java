class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        
        for(int i=0; i<picture.length; i++) {
            String imsi="";
            for(int j=0; j<picture[i].length(); j++) {
                for(int l=0; l<k; l++) {
                    imsi += picture[i].charAt(j);
                }
            }
            for(int j=0; j<k; j++) {
                answer[i*k + j] = imsi;
            }
        }
        
        return answer;
    }
}