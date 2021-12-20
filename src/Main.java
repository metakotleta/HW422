import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Postfixer postfixer = new Postfixer();

        System.out.println("Введите выражение: ");
        String input[] = scanner.nextLine().split(" ");
        postfixer.addToTransform(input);

        System.out.println(postfixer);
    }
}
