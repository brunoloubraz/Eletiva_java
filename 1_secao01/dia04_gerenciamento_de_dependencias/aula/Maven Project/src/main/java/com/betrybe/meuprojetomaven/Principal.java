/**
 * Este pacote contém as classes relacionadas ao projeto Maven. Inclui a classe Principal, que é o
 * ponto de entrada da aplicação.
 */

package com.betrybe.meuprojetomaven;

import com.google.common.base.Joiner;

/**
 * The type Principal.
 */
public final class Principal {

  // Este construtor privado previne a instanciação da classe
  private Principal() {
    // Esse construtor está vazio, já que a classe é uma classe utilitária
  }

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(final String[] args) {
    String result = Joiner.on(", ").skipNulls().join("Olá", null, "mundo");
    System.out.println(result);
  }
}
