class Solution {
    public int solution(int[][] dots) {
        // dots = [A, B, C, D]
        // Case 1: AB vs CD
        if (isParallel(dots[0], dots[1], dots[2], dots[3])) return 1;
        
        // Case 2: AC vs BD
        if (isParallel(dots[0], dots[2], dots[1], dots[3])) return 1;
        
        // Case 3: AD vs BC
        if (isParallel(dots[0], dots[3], dots[1], dots[2])) return 1;
        
        return 0; // 세 경우 모두 평행하지 않으면 0
    }
    
    // 두 직선이 평행한지 대각선 곱(Cross Product)으로 판단하는 메서드
    private boolean isParallel(int[] p1, int[] p2, int[] p3, int[] p4) {
        int dy1 = p2[1] - p1[1];
        int dx1 = p2[0] - p1[0];
        
        int dy2 = p4[1] - p3[1];
        int dx2 = p4[0] - p3[0];
        
        // dy1 / dx1 == dy2 / dx2  <=>  dy1 * dx2 == dy2 * dx1
        return (long) dy1 * dx2 == (long) dy2 * dx1;
    }
}