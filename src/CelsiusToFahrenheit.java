import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Loop until valid input is provided
        while (true) {
            System.out.print("Enter temperature in Celsius: ");
            
            // Check if the input is a valid number
            if (scanner.hasNextDouble()) {
                double celsius = scanner.nextDouble();
                
                // Convert to Fahrenheit using the formula
                double fahrenheit = (celsius * 9 / 5) + 32;
                
                // Display the result
                System.out.println("Equivalent temperature in Fahrenheit: " + fahrenheit);
                
                // Exit the loop after successful conversion
                break;
            } else {
                // If invalid input, prompt the user again
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();  // Clear the invalid input
            }
        }
        
        scanner.close();
    }
}
