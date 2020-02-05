
public class longg {
    public static void main(String[] args) {
        int value = 8;
        int bitIndex = 8;
        int mask = (int)Math.pow(2, bitIndex - 1 );
        //int mask1 = ~mask;
        int result = mask ^ value;
        System.out.println("value в двоичном виде " + Integer.toBinaryString(value));
        System.out.println("маска в десятичном виде " + mask);
        System.out.println("маска в двоичном виде " + Integer.toBinaryString(mask));
        System.out.println("результат сложения с маской " + Integer.toBinaryString(result));


    }
}
