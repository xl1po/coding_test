class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<answer.length; i++) {
            String[] nums = quiz[i].split(" ");
            int imsi = Integer.parseInt(nums[0]);

            for (int j = 1; j < nums.length; j += 2) {
                String op = nums[j];
                int nextNum = Integer.parseInt(nums[j + 1]);

                if(op.equals("=")) {
                    if(imsi == Integer.parseInt(nums[j+1])) {
                        answer[i] = "O";
                    } else {
                        answer[i] = "X";
                    }

                    break;
                }
                if (op.equals("+")) {
                    imsi += nextNum;
                } else if (op.equals("-")) {
                    imsi -= nextNum;
                }
            }
        }
        
        return answer;
    }
}