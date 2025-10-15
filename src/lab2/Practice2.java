package lab2;

public class Practice2 {
    public static void main(String[] args) {
        double a1 = 3.56;
        double b1 = 1.02;
        double c1 = 3;
        double d1 = 2.43;
        double a2 = 2.54;
        double b2 = 1.23;
        double c2 = -2.14;
        double d2 = -0.23;
        double a3 = -1.23;
        double b3 = -0.34;
        double c3 = 0.707;
        double d3 = 2.312;

        double y1 = Math.pow(Math.tan(a1), 1.0 / c1) / (1.0 + Math.sinh(b1) / Math.log(Math.abs(d1 + c1)));
        double y2 = 2.0 * Math.cos(Math.pow(a2, b2)) + Math.abs(Math.acos(-Math.sqrt(c2 / d2)));
        double y3 = 3.0 * (Math.log10(Math.abs(b3 / a3)) + Math.sqrt(Math.sin(c3)) + Math.exp(d3));

        System.out.println("Task 1: y = " + y1);
        System.out.println("Task 2: y = " + y2);
        System.out.println("Task 3: y = " + y3);
    }
}
