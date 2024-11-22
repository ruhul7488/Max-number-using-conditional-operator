import java.util.Scanner;

public class Max {
    public static void main(String1[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        double max = (num1 > num2) ? num1 : num2;

        System.out.printf("The maximum between %.2f and %.2f is: %.2f%n", num1, num2, max);


    }
}
