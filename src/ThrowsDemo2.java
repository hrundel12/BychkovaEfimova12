import java.util.Scanner;

public class ThrowsDemo2{

    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        try {
            printDetails(key);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public void printDetails(String key) throws Exception {  // Метод объявляет, что может выбросить исключение
        String message = getDetails(key);
        System.out.println(message);
    }

    // Метод теперь выбрасывает исключение, и нужно это обработать или объявить
    private String getDetails(String key) throws Exception {  // Метод также объявляет, что может выбросить Exception
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo2 demo = new ThrowsDemo2();
        demo.getKey();  // Запуск программы
    }
}