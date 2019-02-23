package quadraticEquation;
import java.util.Scanner;

public class quadraticEquation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Quadratic Equation in form: a * x * x + b * x + c = 0.");
        System.out.print("Enter a: ");
        float a = keyboard.nextFloat();
        System.out.print("Enter b: ");
        float b = keyboard.nextFloat();
        System.out.print("Enter c: ");
        float c = keyboard.nextFloat();


        if (a == 0) {
            // Equation in form of b * x + c = 0
            if (b == 0) {
                if (c == 0) {
                    System.out.println("The solution is all x");
                } else {
                    System.out.println("No solution");
                }
            } else {
                double x = - c / b;
                System.out.println("The solution is " + x);
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            double x1 = ( - b + Math.sqrt(delta)) / (2 * a);
            double x2 = ( - b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("The solution are x1= %f and x2 = %f", x1, x2);
        }
    }
}
