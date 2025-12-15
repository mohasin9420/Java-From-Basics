import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
