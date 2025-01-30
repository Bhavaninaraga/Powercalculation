import java.util.Scanner;

public class Powercalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input base and exponent
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        
        // Calculate power using Math.pow()
        double result = Math.pow(base, exponent);
        
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
        
        scanner.close();
    }
}
