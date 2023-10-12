public interface PrePostIncrementDecrementExample {

    public static void main(String[] args) {

        int x = 5;
        int y = ++x;

        System.out.println("x is: " + x);
        System.out.println("y is: " + y);

        int a = 5;
        int b = a++;

        System.out.println("a is: " + a);
        System.out.println("b is: " + b);


        int c = 5;
        int d = --c;

        System.out.println("c is: " + c);
        System.out.println("d is: " + d);

        int e = 5;
        int f = e--;

        System.out.println("e is: " + e);
        System.out.println("f is: " + f);
    }
}
