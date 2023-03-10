package Projects;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.prefs.Preferences;

    public class CheatSheet {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Preferences prefs = Preferences.userRoot().node("MyApp");

            while (true) {
                System.out.println("1. Add a cheat sheet");
                System.out.println("2. Get a cheat sheet");
                System.out.println("3. Exit");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter cheat sheet name: ");
                        String name = scanner.next();
                        System.out.print("Enter cheat sheet content: ");
                        String content = scanner.next();
                        prefs.put(name, content);
                        System.out.println("Cheat sheet added successfully.");
                        break;

                    case 2:
                        System.out.print("Enter cheat sheet name: ");
                        String sheetName = scanner.next();
                        String sheetContent = prefs.get(sheetName, null);
                        if (sheetContent != null) {
                            System.out.println(sheetContent);
                        } else {
                            System.out.println("Cheat sheet not found.");
                        }
                        break;

                    case 3:
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            }
        }
    }
