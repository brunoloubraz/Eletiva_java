package com.podcasts.pod.service;

import com.podcasts.pod.model.Podcast;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class PodService {

  public Podcast findPodcastById(Long id) {
    Podcast podcast = new Podcast();

    podcast.setId(id);
    podcast.setName("Meu podcast");
    podcast.setUrl("www.meupodcast.com.br");

    podcast.setSecretToken("super-secret-token-123");
    return podcast;
  }

  public Podcast savePodcast(Podcast podcast) {
    Podcast savedPodcast = new Podcast();

    savedPodcast.setId(new Random().nextLong(0, 100));
    savedPodcast.setName(podcast.getName());
    savedPodcast.setUrl(podcast.getUrl());

    return savedPodcast;
  }



}
