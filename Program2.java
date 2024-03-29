public class Main {
    public static void main(String[] args) {
        double num1 = 5.5;
        double num2 = 10.3;
        double result = calculateSum(num1, num2);
        System.out.println("The sum is: " + result);
    }

    public static double calculateSum(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }
}
