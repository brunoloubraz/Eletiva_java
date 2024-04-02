package com.betrybe.electronic;

public class Television {

  private boolean isOn = false;
  private String brand;
  private String model;
  private int size;
  private static final int MAX_VOLUME = 30;
  private int volume = 0;
  private static double INCH_TO_CM = 2.54;

  public static double convertToCentimeters(double inches) {
    return inches * INCH_TO_CM;
  }

  public int getVolume() {
    return volume;
  }

  public boolean isOn() {
    return isOn;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getSize() {
    return size;
  }

  public Television(String brand, String model, int size) {
    this.brand = brand;
    this.model = model;
    this.size = size;
    System.out.println("Construtor da classe Television sendo executado...");
  }

  public static void main(String[] args) {
    System.out.println("Iniciando sistema...");
    Television television = new Television("Phillips", "LCD", 32);
    television.turnOn();
    television.turnOff();
    System.out.println(television.info());
    System.out.println("A televisão está lidaga?");
    System.out.println(television.isOn());
    System.out.println("O volume atual é:");
    System.out.println(television.getVolume());
    System.out.println(television.getModel());
    television.setModel("LCD-LCD_LED");
    System.out.println(television.getModel());
    double sizeCm = Television.convertToCentimeters(32);
    System.out.println("O tamano em centimetros é: " + sizeCm);
    System.out.println(Math.sqrt(4));
    System.out.println(Math.PI * 2);
    System.out.println("Finalizando sistema...");
  }

  public void turnOn() {
    System.out.println("Ligando televisão...");
    this.isOn = true;
  }

  void turnOff() {
    System.out.println("Desligando televisão...");
    this.isOn = false;
  }

  public String info() {
    return "Marca: %s, Modelo %s, Tamanho: %d, Ligada: %b".formatted(
        brand, model, size, isOn
    );
  }

  public void increaseVolume() {
    if (volume < MAX_VOLUME) {
      volume++;
    }
  }

  public void decreaseVolume() {
    if (volume > 0) {
      volume--;
    }
  }
}
