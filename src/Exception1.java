public class Exception1 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0); // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed."); // Обработка деления на 0
        }
    }

    public static void main(String[] args) {
        Exception1 ex = new Exception1();
        ex.exceptionDemo();
    }
}