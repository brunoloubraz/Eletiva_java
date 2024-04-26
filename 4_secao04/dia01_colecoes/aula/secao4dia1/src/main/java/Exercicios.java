import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicios {

  public static void main(String[] args) {
//    Exercicio 1
    ArrayList<Integer> lista = new ArrayList<Integer>();
    lista.add(1);
    lista.add(123);
    lista.add(5324);
    lista.add(1123);
    lista.add(5487);
    lista.add(9460385);
    lista.add(689054);
    lista.add(7623);
    lista.add(95523);
    lista.add(95522);
    lista.add(4);
    lista.add(8);

    System.out.println("Números pares " + lista.stream().filter(e -> e % 2 == 0).toList());

//    Exercicio 2
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("Bruno");
    stringList.add("maTheus");
    stringList.add("AlbErTo");
    stringList.add("JuliA");
    stringList.add("Marcos");
    stringList.add("ROBERTA");
    stringList.add("AMandA");

    System.out.println(stringList.stream().map(String::toUpperCase).toList());

//    Exercicio 3

    ArrayList<Integer> listaParaSomar = new ArrayList<Integer>();
    listaParaSomar.add(1);
    listaParaSomar.add(2);
    listaParaSomar.add(3);
    listaParaSomar.add(4);
    listaParaSomar.add(5);
    listaParaSomar.add(5);

    System.out.println(listaParaSomar.stream().mapToInt(Integer::intValue).sum());

//    Exercicio 4

    ArrayList<String> names = new ArrayList<String>();
    names.add("Bruno");
    names.add("maTheus");
    names.add("AlbErTo");
    names.add("JuliA");
    names.add("Marcos");
    names.add("ROBERTA");
    names.add("AMandA");
    int number = 6;
    List<String> palavras = List.of("java", "stream", "programação", "backend");

    List<String> filteredNames = names.stream()
        .filter(e -> e.length() > number)
        .toList();

    System.out.println(filteredNames);
  }
}
