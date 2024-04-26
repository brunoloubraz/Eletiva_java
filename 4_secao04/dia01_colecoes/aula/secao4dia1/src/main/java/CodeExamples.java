import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CodeExamples {
  public static Collection<Estudante> obterEntrada() {
    return Set.of(
        new Estudante("2001", "Maria", "Computacao"),
        new Estudante("2009", "Bruno", "Computacao"),
        new Estudante("2003", "Joao", "Computacao"),
        new Estudante("2004", "Marcos", "Computacao"),
        new Estudante("2005", "Audete", "Computacao"),
        new Estudante("2003", "Lance", "Computacao")
    );
  }

  public static void main(String[] args) {
    Collection<Estudante> entrada = obterEntrada();
    List<String> matriculas = entrada.stream()
        .filter(e -> "Computacao".equals(e.getCurso()))
        .sorted(Comparator.comparing(Estudante::getNome))
        .map(Estudante::getMatricula)
        .toList();
    System.out.println(matriculas);

    Collection<String> nome = List.of("Fulano", "maria", "Fulano", "joao", "braz", "maria");
    long pessoasContagem = nome.stream().distinct().count();
    System.out.println(pessoasContagem);
    List<String> pessoas = nome.stream().distinct().toList();
    System.out.println(pessoas);
  }
}
