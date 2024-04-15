package com.podcasts.pod.controller;

import com.podcasts.pod.dto.PodcastCreationDto;
import com.podcasts.pod.dto.PodcastDto;
import com.podcasts.pod.model.Podcast;
import com.podcasts.pod.service.PodService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/podcasts")
public class PodController {
  private PodService service;

  public PodController(PodService service) {
    this.service = service;
  }

//  @GetMapping
//  @RequestMapping(method = RequestMethod.GET)
  @GetMapping
  public String getRoot(){
    return "Yay podcasts!";
  }

  @GetMapping("/{id}")
  public ResponseEntity<PodcastDto> getPodcast(@PathVariable Long id) {
    if (id >  1000) {
      return ResponseEntity.notFound().build();
    }
    Podcast podcast = service.findPodcastById(id);
    PodcastDto podcastDto = new PodcastDto(
        podcast.getId(), podcast.getName(), podcast.getUrl()
    );
    return ResponseEntity.ok(podcastDto);
  }

  @GetMapping("/search")
  public String searchPodcast(@RequestParam String title) {
    return "Você buscou por Podcasts com o título: %s".formatted(title);
//    http://localhost:8080/podcasts/search?title=asdsa
  }

  @PostMapping
  public ResponseEntity<PodcastDto> newPodcast(@RequestBody PodcastCreationDto podcastCreationDto) {
    Podcast newPodcast = new Podcast();
    newPodcast.setName(podcastCreationDto.name());
    newPodcast.setUrl(podcastCreationDto.url());

    Podcast savedPodcast = service.savePodcast(newPodcast);

    PodcastDto podcastDto = new PodcastDto(
        savedPodcast.getId(),
        savedPodcast.getName(),
        savedPodcast.getUrl()
    );

    return ResponseEntity.status(HttpStatus.CREATED).body(podcastDto);
  }
}
