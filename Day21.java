package informatic_study_club;

public class Day21 {

    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(fibonacci(i));
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
