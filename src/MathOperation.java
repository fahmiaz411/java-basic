package src;

public class MathOperation {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Augmented Assignment
         a += b; // a = a + b
         a -= b;
         a *= b;
         a /= b;
         a %= b;

         // Unary Operator
         a++;
         ++a;
         a--;
         --a;
         System.out.println(-a);
         System.out.println(+a);
         System.out.println(!true);

    }
}
