package com.betrybe.alexandria.repository;

import com.betrybe.alexandria.entity.Publisher;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
