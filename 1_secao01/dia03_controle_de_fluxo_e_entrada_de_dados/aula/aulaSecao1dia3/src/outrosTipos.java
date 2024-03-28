import java.util.Scanner;

public class outrosTipos {
    public static void main(String[] args) {
        double numeroDePontoFlutuante = 40_000_000.49d;
        int numeroInteiro = (int) numeroDePontoFlutuante;
        short numeroInteiroPequeno = (short) numeroInteiro;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o primeiro número: ");
        String input1 = scanner.next();
        System.out.print("Entre com o segundo número: ");
        String input2 = scanner.next();

        int n1 = Integer.parseInt(input1);
        int n2 = Integer.parseInt(input2);

        int resultado = n1 + n2;
        System.out.println("O resultado da soma é: " + resultado);
    }
}
