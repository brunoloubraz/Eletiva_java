import java.util.HashMap;

public class Mapexs {

  public static void main(String[] args) {
    HashMap<String, String> estudantes = new HashMap<String, String>();
    estudantes.put("x283719", "joao");
    estudantes.put("x748653", "Maria");
    estudantes.put("x15237", "Joana");

    System.out.println(estudantes);
    estudantes.put("x283719", "Bruno");
    System.out.println(estudantes);
    System.out.println(estudantes.get("x283719"));
    estudantes.remove("x283719");
    System.out.println(estudantes);
  }
}
