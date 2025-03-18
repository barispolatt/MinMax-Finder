import java.util.Scanner;
public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int n = sc.nextInt();
        if(n<=0) System.out.println("Invalid number!");

        System.out.print("Enter number 1: ");
        int num = sc.nextInt();
        int min = num;
        int max = num;
        for (int i = 2; i<=n; i++) {
            System.out.print("Enter number " + i + ": ");
            num = sc.nextInt();
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        sc.close();
    }
}
