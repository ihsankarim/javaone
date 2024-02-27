import java.util.ArrayList;
import java.util.Scanner;

public class NotesCli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> note = new ArrayList<>();

        System.out.println("Welcome to notes cli");

        while (true) {
            System.out.println("\nChoice:");
            System.out.println("1. Add note");
            System.out.println("2. View Note");
            System.out.println("3. Exit");

            System.out.println("Input choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // removing newline in buffer

            switch (choice) {
                case 1:
                    System.out.println("Input choice: ");
                    String contentOfNotes = scanner.nextLine();
                    note.add(contentOfNotes);
                    System.out.println("Note is added!");
                    break;
                case 2:
                    System.out.println("Notes now");
                    for (int i = 0; i < note.size(); i++) {
                        System.out.println((i + 1) + ". " + note.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Thanks! Program is completed");
                    System.exit(0);
                default:
                    System.out.println("Invalid option, Please try again!");
            }

        }
    }
}
