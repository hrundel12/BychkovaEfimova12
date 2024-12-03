import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString); // Преобразование строки в число
            System.out.println("Result: " + (2 / i)); // Деление
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed."); // Обработка деления на 0
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer."); // Обработка некорректного ввода
        }
    }

    public static void main(String[] args) {
        Exception2 ex = new Exception2();
        ex.exceptionDemo();
    }
}