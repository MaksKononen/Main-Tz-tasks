import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение (например, 2 + 3):");
        String input = scanner.nextLine();

        try {
            String result = calc(input);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static String calc(String input) throws Exception {
        String[] parts = input.split(" ");

        if (parts.length != 3) {
            throw new Exception("Неверный формат выражения!");
        }

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);

        if ((a < 1 || a > 10) || (b < 1 || b > 10)) {
            throw new Exception("Числа должны быть от 1 до 10!");
        }

        int result = 0;

        switch (parts[1]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                throw new Exception("Неподдерживаемая операция!");
        }
        return String.valueOf(result);
    }
}