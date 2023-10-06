public class VariableExample {

    int a = 10; // Instance Variable

    int d, e;
    static int b = 20; // Class Level Variable

    public static void main(String[] args) {
        int c = 30; // Local Variable
        System.out.println(c); // c variable is accessible here
    }

    void m1() {
        System.out.println(b);
    }
}
