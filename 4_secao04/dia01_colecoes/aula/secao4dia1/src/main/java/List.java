import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List {

  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    numeros.add(7);
    numeros.add(2);
    numeros.add(1);
    numeros.add(9);
    System.out.println(numeros);
    Collections.sort(numeros);
    System.out.println(numeros);

    java.util.List<String> estudantes = Arrays.asList("João", "Maria", "Pedro", "Rosa");
    System.out.println(estudantes);
    java.util.List<String> estudantes2 = Arrays.asList(new String[]{"João", "Maria", "Pedro", "Rosa"});
    System.out.println(estudantes2);

    java.util.List<String> estudantesComOf = java.util.List.of("joao", "Maria", "Pedro", "Rosa");
    System.out.println(estudantesComOf.get(3));

    java.util.List<String> estudantesSet = Arrays.asList("joao", "Maria", "Pedro", "Rosa");
    estudantesSet.set(0,"Joana");
    System.out.println(estudantesSet);

    ArrayList<String> estuds = new ArrayList<String>(Arrays.asList("joao", "Maria", "Pedro", "Rosa"));
    estuds.add("Joana");
    System.out.println(estuds);
    estuds.remove(1);
    estuds.remove("Pedro");
    System.out.println(estuds);
    System.out.println(estuds.contains("joao"));
    System.out.println(estuds.size());

    ;  }
}
