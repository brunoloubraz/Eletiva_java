package com.betrybe.transportadora.core;

import com.betrybe.transportadora.main.Veiculo;

public class Carro extends Veiculo {

  public Carro(String placa, int anoFabricacao) {
    super(placa, anoFabricacao);
    this.setCombustivel("Flex");
  }

  @Override
  public void abastecer(String local, String motorista, Double valor) {
    this.getAbastecimentos().add(String.format("Local: %s, Motorista: %s, valor: R$ %.2f", local, motorista, valor));
  }
}
