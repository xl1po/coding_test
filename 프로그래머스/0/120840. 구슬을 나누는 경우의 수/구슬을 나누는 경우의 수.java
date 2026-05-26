import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        
        if (balls == share || share == 0) return 1;
        
        BigInteger numerator = BigInteger.ONE;
        BigInteger denominator = BigInteger.ONE;
        
        
        int loop = Math.min(share, balls - share);
        
        for (int i = 0; i < loop; i++) {
            numerator = numerator.multiply(BigInteger.valueOf(balls - i));
            denominator = denominator.multiply(BigInteger.valueOf(i + 1));
        }
        
        return numerator.divide(denominator).intValue();
    }
}