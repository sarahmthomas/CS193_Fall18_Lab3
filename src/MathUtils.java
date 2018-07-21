public class MathUtils {
    /**
     * divideNumbers -- a / b
     * Divide a by b and return the result
     */
    public float divideNumbers(int a, int b) {
        float res = a / b;
        return res;
    }

    /**
     * raiseToPower -- (base)^(exp)
     * Raise the number base to power exp
     */
    public int raiseToPower(int base, int exp) {
        int res = base;
        for (int i = 0; i < exp; i++) {
           res *= base; 
        }
        // If it's a negative exponent invert it
        if (exp < 0) {
            res = divideNumbers(1, res);
        }
        return res; 
    }    
}