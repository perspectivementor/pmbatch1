public class BitwiseOperatorsExample {

    public static void main(String[] args) {

        int num1 = 12;  // Binary: 1100
        int num2 = 7;   // Binary: 0111

        // Bitwise AND
        int resultAnd = num1 & num2;
        System.out.println("Bitwise AND: " + resultAnd);

        // Bitwise OR
        int resultOr = num1 | num2;
        System.out.println("Bitwise OR: " + resultOr);

        // Bitwise XOR
        int resultXor = num1 ^ num2;
        System.out.println("Bitwise XOR: " + resultXor);


    }
}
