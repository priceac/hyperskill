import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = new String[4];

        for (var i=0; i<words.length; i++) {
            words[i] = scanner.next();
        }

        for (String word : words) {
            System.out.println(word);
        }

    }
}