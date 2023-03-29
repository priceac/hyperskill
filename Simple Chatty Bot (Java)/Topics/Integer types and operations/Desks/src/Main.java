import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt();

        int desks1 = class1 / 2 + class1 % 2;
        int desks2 = class2 / 2 + class2 % 2;
        int desks3 = class3 / 2 + class3 % 2;

        System.out.print(desks1 + desks2 + desks3);
    }
}