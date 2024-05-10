import java.time.LocalDate;

public class AlertaAniverario {

  public void checarAniversario() {
    LocalDate dataHoje = LocalDate.now();
    LocalDate nascimento = LocalDate.parse("2000-12-21");

    if(dataHoje.getMonth() == nascimento.getMonth()) {
      if (dataHoje.getDayOfMonth() == nascimento.getDayOfMonth()) {
        System.out.println("Hoje é seu aniversário!");
      } else if (dataHoje.getDayOfMonth() < nascimento.getDayOfMonth()) {
        System.out.println("Seu aniversário esta próximo!");
      } else {
        System.out.println("Seu aniversário ja passou!");
      }
    } else {
      System.out.println("Não é seu aniversário.");
    }
  }
}
