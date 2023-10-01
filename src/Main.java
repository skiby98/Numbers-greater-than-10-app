import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of value drawers: ");
        int n = scanner.nextInt();

        int[] tab = new int[n];

        System.out.println("Enter the number of value drawers: ");
        for (int i=0; i < n; i++){
            tab[i] = scanner.nextInt();
        }
        for (int i=0; i < n; i++) {
            if (tab[i]>10) {
                System.out.println("Yes,the value is greater than 10");
            } else {
                System.out.println("No, the value is not greater than 10");
            }
        }
    }
}