public class DataTypeWidening {

    public static void main(String[] args) {

        int numInt = 10;
        double numDouble = numInt; // Implicit conversion from int to double

        System.out.println(numDouble); // Output: 10.0

        float a = 10.5f;

        double b = a;
        System.out.println(b);
    }
}
