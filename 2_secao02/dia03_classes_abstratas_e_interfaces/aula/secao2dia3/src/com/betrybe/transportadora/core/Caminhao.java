package com.betrybe.transportadora.core;

import com.betrybe.transportadora.main.Veiculo;
import java.util.List;

public class Caminhao extends Veiculo implements Transportador{

  public Caminhao(String placa, int anoFabricacao) {
    super(placa, anoFabricacao);
    this.setCombustivel("Diesel");
  }

  @Override
  public void abastecer(String local, String motorista, Double valor) {
    this.getAbastecimentos().add(String.format("Local: base, Motorista: %s, valor: R$ %.2f", motorista, valor));
  }

  public String transportar(String origem, String destino) {
    return String.format("Veiculo de placa %s, vai transportar carga de %s para %s", this.getPlaca(), origem, destino);
  }
}
