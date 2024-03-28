import java.util.Scanner;

public class comparandoValores {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(numero == 5);
        Scanner scanner = new Scanner(System.in);
        String hello = "Olá";
        System.out.println("Diga olá: ");
        String input = scanner.next();

        if (hello == input) {
            System.out.println("Isso não será impresso");
        }
        if (hello != input) {
            System.out.println("Isso será impresso");
        }
        if (hello == input) {
            System.out.println("Isso também será impresso, é o mesmo objeto");
        }
        if (hello.equals(input)) {
            System.out.println("Isso pode ser impresso se Olá for inserido no terminal");
        }
    }
}
