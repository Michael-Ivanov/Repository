import java.math.BigInteger;

public class factorial {
    public static void main(String[] args) {
        int value = 1;
        BigInteger f = BigInteger.valueOf(1);
        for (int i = 1; i < value + 1; i++) {
            f = f.multiply(BigInteger.valueOf(i));
            System.out.println(f);
        }
        System.out.println("value! = " + f);
    }
}
