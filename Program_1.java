package test;

public class Program_1{
    private double a;
    private double b;

    public Program_1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double performOperation(String operationType) {
        double result = 0.0;
        switch (operationType) {
            case "addition":
                result = a + b;
                break;
            case "subtraction":
                result = a - b;
                break;
            case "multiplication":
                result = a * b;
                break;
            case "division":
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operation type.");
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        double a = 10.0;
        double b = 5.0;
        String operationType = "addition";

        Program_1 Program_1 = new Program_1(a, b);
        double result = Program_1.performOperation(operationType);

        System.out.println("Result: " + result);
    }
}
