public class Greeting {
    private String name;
    private String language;

    public void split() {
        String input = Input.readUserAndLanguage();
        String[] split = input.split(" ");
        name = split[0];
        language = split.length > 1 ? split[1] : "hun";
    }

    public void print() {
        if (!name.equals("")) {
            switch (language) {
                case "hun":
                    System.out.print("Szia, " + name);
                    break;
                case "eng":
                    System.out.print("Hello, " + name);
                    break;
                case "haw":
                    System.out.print("Aloha, " + name);
                    break;
                default:
                    System.out.println("Ismeretlen nyelv");
                    break;
            }
        } else {
            System.out.println("Nem adott meg nevet!");
        }
    }
}