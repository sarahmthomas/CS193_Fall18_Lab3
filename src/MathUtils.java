public class MathUtils {
    /**
     * divideNumbers -- a / b
     * Divide a by b and return the result
     */
    public static double divideNumbers(int dividend, int divisor) {
        double res = dividend / divisor;
        return res;
    }

    /**
     * raiseToPower -- (base)^(exp)
     * Raise the number base to power exp
     */
    public static double raiseToPower(int base, int exp) {
        int res = base;
        boolean isNegative = false;

        if (exp < 0) {
            exp *= -1;
            isNegative = true;
        }

        for (int i = 0; i < exp; i++) {
           res *= base; 
        }

        // If it's a negative exponent invert it
        if (isNegative) {
            return divideNumbers(1, res);
        } else {
            return res;
        }
    }    
}