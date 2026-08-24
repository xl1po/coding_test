class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};

        int r = 0, c = 0;
        int d = 0;
        for (int num = 1; num <= n * n; num++) {
            answer[r][c] = num;

            int nr = r + dir[d][0];
            int nc = c + dir[d][1];

            if (nr < 0 || nr >= n || nc < 0 || nc >= n || answer[nr][nc] != 0) {
                d = (d + 1) % 4;
                nr = r + dir[d][0];
                nc = c + dir[d][1];
            }

            r = nr;
            c = nc;
        }
        
        return answer;
    }
}