package com.betrybe.electronic;

public class Carro {

  private String marca;
  private String modelo;
  private int ano;
  static int contador = 0;

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public Carro(String marca, String modelo, int ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    contador++;
  }

  public static void main(String[] args) {
    Carro car = new Carro("HB20", "Hyundai", 2024);
    Carro carr = new Carro("HB20", "Hyundai", 2024);
    Carro carro = new Carro("HB20", "Hyundai", 2024);
    car.exibirInformacoes();
    System.out.println();
    System.out.println(quantidadeDeCarros());
  }

  public void exibirInformacoes() {
    System.out.printf(
        "Marca: %s, Modelo: %s, Ano: %d", marca, modelo, ano
    );
  }

  public static int quantidadeDeCarros() {
    return contador;
  }
}
