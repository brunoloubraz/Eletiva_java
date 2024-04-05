package com.betrybe.transportadora.main;

import com.betrybe.transportadora.core.Carro;

public class Principal {

  public static void main(String[] args) {
    Carro c1 = new Carro("RTF 1234", 2018);
    c1.abastecer("Posto 1", "Carlos", 200.0);
    c1.abastecer("Posto 2", "Rodrigo", 400.0);
    c1.abastecer("Posto 3", "Chaves", 2200.0);

    c1.listaAbastecimentos();
  }
}
