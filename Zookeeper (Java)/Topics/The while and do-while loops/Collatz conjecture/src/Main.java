import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        collatz(input);
    }
    public static void collatz(int x) {
        System.out.print(x);
        while (x != 1) {
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = x * 3 + 1;
            }
            System.out.printf(" %d", x);
        }
    }
}