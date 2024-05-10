import java.time.Clock;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Principal {

  public static void main(String[] args) {
    Clock relogio = Clock.systemDefaultZone();
    System.out.println(relogio);
    System.out.println(relogio.instant());

    LocalDateTime now = LocalDateTime.now();
    System.out.println(now);
    System.out.println(now.getHour());

    LocalDateTime triste = LocalDateTime.parse("2014-07-08T17:00:00");
    System.out.println(triste);


    Academia agenda = new Academia();
    agenda.verificarDiaAcademia();

    LocalDateTime dateTime = LocalDateTime.of(2023,7,11,10,30,0);
    System.out.println(dateTime);
    System.out.println(dateTime.getYear());
    System.out.println(dateTime.getMonth());
    System.out.println(dateTime.getHour());
    System.out.println(dateTime.getMonth());
    System.out.println(dateTime.getMinute());
    System.out.println(dateTime.getSecond());
    LocalDateTime newDateTime = dateTime.plusYears(1);
    System.out.println(newDateTime);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    String formattedDateTime = dateTime.format(formatter);
    System.out.println(formattedDateTime);

    HoraRefeicao agendaRefeicao = new HoraRefeicao();
    agendaRefeicao.calcularHoraRefeicao();

    IdadeEmDias idade = new IdadeEmDias();
    System.out.println("A quantidade de dias desde o seu nascimento é: " + idade.calcularIdadeEmDias("1998-05-09T17:56:15"));

    AlertaAniverario alerta = new AlertaAniverario();
    alerta.checarAniversario();

    PontoEletronico ponto = new PontoEletronico();
    ponto.marcarHoraExtra();

    Duration diaParaMinutos = Duration.ofDays(1);
    System.out.println(diaParaMinutos.getSeconds());

    LocalDateTime hoje = LocalDateTime.now();
    LocalDateTime diaPassado = LocalDateTime.parse("2021-12-20T17:00:00");

    Duration duracao = Duration.between(diaPassado, hoje);
    System.out.println(duracao.toDays());
  }
}
