import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readUserAndLanguage() {
        System.out.print("Adjon meg egy nevet és nyelvet (hun/eng/haw): ");
        return scanner.nextLine();
    }

}
