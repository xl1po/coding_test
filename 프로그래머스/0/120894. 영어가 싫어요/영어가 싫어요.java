class Solution {
    public long solution(String numbers) {
        String[] numString = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        long answer = 0;
        
        String imsi = "";
        for(int i=0; i<numbers.length(); i++) {
            if(!imsi.equals("")) {
                for(int j=0; j<10; j++) {
                    if(imsi.equals(numString[j])) {
                        answer = answer*10 + j;
                        imsi = "";
                        break;
                    }
                }
            }
            imsi += numbers.charAt(i);
        }
        for(int i=0; i<10; i++) {
            if(imsi.equals(numString[i])) {
                answer = answer*10 + i;
                break;
            }
        }
        
        return answer;
    }
}