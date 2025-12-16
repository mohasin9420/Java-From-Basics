import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Tea");
        System.out.println("2. Coffee");
        System.out.println("3. Juice");

        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Tea");
                break;
            case 2:
                System.out.println("You selected Coffee");
                break;
            case 3:
                System.out.println("You selected Juice");
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}

