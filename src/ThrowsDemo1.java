public class ThrowsDemo1 {
    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo1 demo = new ThrowsDemo1();
        demo.printMessage(null);  // Пример с ошибкой
        demo.printMessage("Valid Key");  // Пример без ошибки
    }
}