package com.betrybe.transportadora.main;

import java.util.ArrayList;

public abstract class Veiculo {
  private String placa;
  private int anoFabricacao;
  private String combustivel;
  private ArrayList<String> abastecimentos;

  public Veiculo(String placa, int anoFabricacao) {
    this.placa = placa;
    this.anoFabricacao = anoFabricacao;
    this.abastecimentos = new ArrayList<>();
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public int getAnoFabricacao() {
    return anoFabricacao;
  }

  public void setAnoFabricacao(int anoFabricacao) {
    this.anoFabricacao = anoFabricacao;
  }

  public String getCombustivel() {
    return combustivel;
  }

  public void setCombustivel(String combustivel) {
    this.combustivel = combustivel;
  }

  public ArrayList<String> getAbastecimentos() {
    return abastecimentos;
  }

  public void setAbastecimentos(ArrayList<String> abastecimentos) {
    this.abastecimentos = abastecimentos;
  }

  public abstract void abastecer(String local, String motorista, Double valor);

  public void listaAbastecimentos() {
    System.out.println("Abastecimentos do veiculo");
    System.out.println(this.placa);
    for (String abastecimento : this.abastecimentos) {
      System.out.println(abastecimento);
    }
    System.out.println("FIM");
  }
}
