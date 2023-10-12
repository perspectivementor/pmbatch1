public class BooleanOperatorsExample {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;

        // Using AND operator
        boolean andResult = a && b;
        System.out.println("a && b: " + andResult);

        // Using OR operator
        boolean orResult = a || b;
        System.out.println("a || b: " + orResult);

        // Using NOT operator
        boolean notResultA = !a;
        boolean notResultB = !b;
        System.out.println("!a: " + notResultA);
        System.out.println("!b: " + notResultB);

    }
}
