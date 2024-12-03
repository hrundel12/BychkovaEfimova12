import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString); // Преобразование строки в число
            System.out.println("Result: " + (2 / i)); // Деление
            // Пример ошибки, которая не будет перехвачена в первых блоках
            String str = null;
            System.out.println(str.length());  // Это вызовет NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed."); // Обработка деления на 0
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer."); // Обработка некорректного ввода
        } catch (Exception e) { // Общая обработка всех исключений
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Exception3 ex = new Exception3();
        ex.exceptionDemo();
    }
}