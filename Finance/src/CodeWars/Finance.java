package CodeWars;

import java.math.BigInteger;

public class Finance {
    public static BigInteger finance(int n) {
        BigInteger result = BigInteger.valueOf(0);

        for (int i = n + 1; i > 0; i--) {
            result = result.add(BigInteger.valueOf((long) (1.5 * (i - 1) * i)));
        }

        return result;
    }

}
