import java.util.Scanner;

public class Exception4 {
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
        } finally {
            System.out.println("Execution completed."); // Этот блок выполнится всегда
            myScanner.close(); // Закрытие сканера после работы
        }
    }

    public static void main(String[] args) {
        Exception4 ex = new Exception4();
        ex.exceptionDemo();
    }
}