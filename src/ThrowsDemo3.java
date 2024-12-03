import java.util.Scanner;

public class ThrowsDemo3 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();

        // Добавляем обработку исключений в методе getKey 
        try {
            printDetails(key);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
            // Даем второй шанс пользователю ввести ключ 
            System.out.println("Try again.");
            getKey();  // Рекурсивно вызываем getKey, чтобы дать второй шанс 
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo3 demo = new ThrowsDemo3();
        demo.getKey();  // Запускаем программу с пользовательским вводом 
    }
}