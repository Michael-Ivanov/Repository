public class powerOfTwoOrNot {
    public static void main(String[] args) {
        boolean n;
        int value = Math.abs(448);
        System.out.println("decimal value = " + value);
        System.out.println("binary value = " + Integer.toBinaryString(value));
        System.out.println("bitCount = " + Integer.bitCount(value));
        System.out.println("power of 2 is " + (Integer.bitCount(value) == 1));
    }
}
