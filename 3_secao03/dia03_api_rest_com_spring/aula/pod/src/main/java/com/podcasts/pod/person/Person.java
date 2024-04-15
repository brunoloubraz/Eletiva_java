package com.podcasts.pod.person;

public record Person (String name, Integer age) {
  public String greeting() {
    return "Olá, meu nome é %s e tenho %s anos".formatted(name, age);
  }
}
