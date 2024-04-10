package injecao;

public class injecaoDependencias {

  public static void main(String[] args) {
    Motor motor = new Motor("alcool");
    Carro carro = new Carro(motor);
  }
}
