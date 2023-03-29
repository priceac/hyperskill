import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int possibleResults = 3;

        int[] sums = new int[possibleResults];
        int parts = scanner.nextInt();
        int[] results = new int[parts];
        for (int i = 0; i < parts; i++) {
            results[i] = scanner.nextInt();
        }
        for (int res : results) {
            if (res == 0) {
                sums[0] += 1;
            } else if (res == 1) {
                sums[1] += 1;
            } else if (res == -1) {
                sums[2] += 1;
            }
        }

        System.out.printf("%d %d %d", sums[0], sums[1], sums[2]);
    }
}