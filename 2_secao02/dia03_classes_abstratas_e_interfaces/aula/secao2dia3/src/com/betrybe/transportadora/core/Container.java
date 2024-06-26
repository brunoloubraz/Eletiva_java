package com.betrybe.transportadora.core;

public class Container implements Transportador{
  private String modelo;
  private double capacidade;

  public Container(String modelo, double capacidade) {
    this.modelo = modelo;
    this.capacidade = capacidade;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public double getCapacidade() {
    return capacidade;
  }

  public void setCapacidade(double capacidade) {
    this.capacidade = capacidade;
  }

  @Override
  public String transportar(String origem, String destino) {
    return String.format("Este container, vai transportar carga de %s para %s",  origem, destino);
  }
}
