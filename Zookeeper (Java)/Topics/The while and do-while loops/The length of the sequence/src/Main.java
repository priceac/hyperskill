import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (scanner.nextInt() > 0) {
            count += 1;
        }
        System.out.print(count);
    }
}