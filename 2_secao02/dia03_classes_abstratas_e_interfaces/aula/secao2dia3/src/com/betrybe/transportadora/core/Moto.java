package com.betrybe.transportadora.core;

import com.betrybe.transportadora.main.Veiculo;

public class Moto extends Veiculo {

  public Moto(String placa, int anoFabricacao) {
    super(placa, anoFabricacao);
    this.setCombustivel("Gasolina");
  }

  @Override
  public void abastecer(String local, String motorista, Double valor) {
    this.getAbastecimentos().add(String.format("Local: %s, Motorista: %s, valor: R$ %.2f", local, motorista, valor));
  }
}
