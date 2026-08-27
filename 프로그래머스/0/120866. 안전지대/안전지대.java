class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        int[][] dir = {{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1},{-1,0},{-1,1}};
        
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == 1) {
                    for(int k=0; k<dir.length; k++) {
                        if((i+dir[k][0]>=0 && i+dir[k][0]<board.length && j+dir[k][1] >=0 && j+dir[k][1]<board.length)&&board[i+dir[k][0]][j+dir[k][1]]!=1)board[i+dir[k][0]][j+dir[k][1]] = 2;
                    }
                }
            }
        }
        
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == 0) answer += 1;
            }
        }
        
        return answer;
    }
}