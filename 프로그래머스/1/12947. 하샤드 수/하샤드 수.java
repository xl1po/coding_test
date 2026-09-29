class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num = x;
        int numSum = 0;
        for(; num>0; num/=10) {
            numSum += num%10;
        }
        if(x%numSum != 0) answer = false;
        return answer;
    }
}