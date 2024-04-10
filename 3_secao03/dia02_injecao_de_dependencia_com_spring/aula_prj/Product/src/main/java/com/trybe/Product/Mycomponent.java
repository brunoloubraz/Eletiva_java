package com.trybe.Product;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mycomponent {
  private final String url;

  public Mycomponent(@Value("${my.component.url}") String url) {
    this.url = url;
  }
}
