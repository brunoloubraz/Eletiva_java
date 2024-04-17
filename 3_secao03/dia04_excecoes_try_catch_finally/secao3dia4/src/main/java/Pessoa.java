import java.util.Optional;

public class Pessoa {
  private String nome;

  public Pessoa(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public String pegaNome(Optional<Pessoa> optional) {
    return optional.map(Pessoa::getNome).orElse("pessoa ausente");
  }
}
