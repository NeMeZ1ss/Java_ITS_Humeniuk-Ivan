package lab3;

public class Practice3_3 {
    public static void main(String[] args) {
        printResults(1e-4);
        printResults(1e-6);
        printResults(0.0); // некоректно: eps <= 0
    }

    static void printResults(double eps) {
        System.out.print("eps:" + eps + " result:");
        try {
            System.out.println(sumInf12(eps));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }

    public static double sumInf12(double eps) {
        if (eps <= 0) throw new IllegalArgumentException("eps: " + eps);
        double sum = 0.0;
        for (int i = 1; ; i++) {
            double term = 1.0 / (i * (i + 1));
            if (Math.abs(term) < eps) break;
            sum += term;
            if (i > 1_000_000) throw new IllegalArgumentException("Забагато ітерацій");
        }
        return sum;
    }
}
