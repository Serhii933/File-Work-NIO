import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Оберіть дію:");
            System.out.println("1. Створити та записати");
            System.out.println("2. Читати");
            System.out.println("3. Вийти");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Введіть назву файлу:");
                    String fileName = scanner.nextLine();
                    System.out.println("Введіть текст для запису:");
                    String content = scanner.nextLine();
                    FileWriteService.writeToFile(fileName, content);
                    break;
                case 2:
                    System.out.println("Введіть назву файлу для читання:");
                    String readFileName = scanner.nextLine();
                    String fileContent = FileReadService.readFromFile(readFileName);
                    if (fileContent != null) {
                        System.out.println("Зміст файлу:");
                        System.out.println(fileContent);
                    }
                    break;
                case 3:
                    System.out.println("До побачення!");
                    return;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }
    }
}

