package com.betrybe.webinar.controller.dto;

import com.betrybe.webinar.entity.Person;

public record PersonDto(
    Long id,
    String fullname,
    String email,
    String username,
    String password) {

  public static PersonDto fromEntity(Person person) {
    return new PersonDto(
        person.getId(),
        person.getFullname(),
        person.getEmail(),
        person.getUsername(),
        person.getPassword()
    );
  }
}
