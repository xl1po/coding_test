class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" ");
        
        int xNum = 0;
        int num = 0;
        for(int i=0; i<arr.length; i++) {
            if(!arr[i].equals("+")) {
                if(arr[i].substring(arr[i].length()-1).equals("x")) {
                    if(arr[i].substring(0, arr[i].length()-1).equals("")) xNum += 1;
                    else xNum += Integer.parseInt(arr[i].substring(0, arr[i].length()-1));
                } else {
                    num += Integer.parseInt(arr[i]);
                }
            }
        }
        if(xNum == 0) answer = num + ""; 
        else {
            if(xNum == 1) answer = "x";
            else answer = xNum + "x";
            if(num != 0) answer += " + " + num;
        }
        
        return answer;
    }
}