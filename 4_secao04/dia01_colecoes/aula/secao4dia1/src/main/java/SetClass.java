import java.util.HashSet;
import java.util.Set;

public class SetClass {

  public static void main(String[] args) {
    Set<String> estudantes = Set.of("Joao", "Maria", "Pedro", "Rosa");
    HashSet<String> estudantesHash = new HashSet<>();

    boolean adicionouJoao = estudantesHash.add("Joao");
    boolean adicionouJoaoDeNovo = estudantesHash.add("Joao");
    boolean adicionouMaria = estudantesHash.add("Maria");
    System.out.println(String.format("adicionouJoao %b", adicionouJoao));
    System.out.println(String.format("adicionouJoaoDeNovo %b", adicionouJoaoDeNovo));
    System.out.println(String.format("adicionouMaria %b", adicionouMaria));
    System.out.println(estudantesHash);
    estudantesHash.remove("Joao");
    System.out.println(estudantesHash);
  }
}
