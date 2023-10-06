public class TwoDimensionalArrayExample {

    public static void main(String[] args) {
        // Declare and initialize a 2x2 array of integers
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        // Access and print individual elements
        System.out.println("Element at (0, 0): " + matrix[0][0]); // Row 0, Column 0 => 1
        System.out.println("Element at (0, 1): " + matrix[0][1]); // Row 0, Column 1 => 2
        System.out.println("Element at (1, 0): " + matrix[1][0]); // Row 1, Column 0 => 3
        System.out.println("Element at (1, 1): " + matrix[1][1]); // Row 1, Column 1 => 4

    }
}
