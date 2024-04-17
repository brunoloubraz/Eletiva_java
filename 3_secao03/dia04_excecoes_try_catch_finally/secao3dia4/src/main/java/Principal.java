import java.util.Optional;
import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    String palavra = null;
    try {
      Integer resultado = 2 / 0;
      System.out.println(resultado);
    } catch (ArithmeticException e) {
      System.out.println("Deu erro!");
    }
    try {
      int comprimentoPalavra = palavra.length();
      System.out.println(comprimentoPalavra);
    } catch (NullPointerException e) {
      System.out.println("A sua palavra é nula " + e.getMessage());
    }
    try {
      int[] numeros = new int[10];
      numeros[15] = 10;
      System.out.println(numeros);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("erro de index");
    }

    int[] numeros = new int[10];
    Scanner entrada = new Scanner(System.in);
    try {
      System.out.println("Digite um índice que quer acessar");
      int indice = entrada.nextInt();
      numeros[indice] = 10;
      numeros[indice] = 2/0;
      System.out.println(numeros);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Essa posicao nao existe!");
    } catch (ArithmeticException e) {
      System.out.println("Não é possível dividir por 0!");
    }

    Pessoa pessoa = new Pessoa("Bob");
    Optional<Pessoa> optional = Optional.ofNullable(pessoa);
    if (optional.isPresent()) {
      System.out.println("Pessoa existe!");
      System.out.println(optional.get().getNome());
    } else {
      System.out.println("Pessoa não existe");
    }
  }
}
