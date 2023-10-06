public class DataTypeNarrowing {

    public static void main(String[] args) {
        double numDouble = 10.5;
        int numInt = (int) numDouble; // Explicit conversion from double to int

        System.out.println(numInt); // Output: 10 (decimal part is truncated)

    }
}
