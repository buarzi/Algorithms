package buarzi.learning;

/*
Bytelandian gold coins
https://www.codechef.com/problems/COINS
 */

public class BytelandianGoldCoins {
    public static long calculate(int n) {
        if (n == 0) {
            return 0;
        } else {
            long sumOfCoins = Long.max(n, (n / 2 + n / 3 + n / 4));
            if (sumOfCoins > n) {
                return sumOfCoins;
            }
        }
        return n;
    }
}
