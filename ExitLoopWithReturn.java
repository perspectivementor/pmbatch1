public class ExitLoopWithReturn {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i > 5) {
                System.out.println("i's value exceeded 5. Exiting loop. Current i value is = "+ i);
                return;
            }
        }
    }

}
