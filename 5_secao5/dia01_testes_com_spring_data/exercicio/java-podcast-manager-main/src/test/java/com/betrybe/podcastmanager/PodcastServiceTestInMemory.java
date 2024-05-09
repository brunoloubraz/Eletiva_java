package com.betrybe.podcastmanager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.betrybe.podcastmanager.entity.Podcast;
import com.betrybe.podcastmanager.exception.PodcastNotFoundException;
import com.betrybe.podcastmanager.service.PodcastService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class PodcastServiceTestInMemory {
  @Autowired
  PodcastService podcastService;

  @Test
  public void testPodcastCreation() {
    Podcast podcast = new Podcast();
    podcast.setName("NovoPod");
    podcast.setUrl("www.newPod.com.br");

    Podcast savePod = podcastService.createPodcast(podcast);

    assertNotNull(savePod.getId());
    assertEquals(podcast.getName(), savePod.getName());
    assertEquals(podcast.getUrl(), savePod.getUrl());
  }

  @Test
  public void testProductRetrieval() {
    Podcast podcast = new Podcast();
    podcast.setName("NovoPod");
    podcast.setUrl("www.newPod.com.br");

    Podcast responsePod = podcastService.getPodcast(podcastService.createPodcast(podcast).getId());

    assertEquals(responsePod.getId(), podcastService.createPodcast(podcast).getId());
    assertEquals(responsePod.getName(), responsePod.getName());
    assertEquals(responsePod.getUrl(), responsePod.getUrl());
  }

  @Test
  public void testException() {
    assertThrows(PodcastNotFoundException.class, () -> podcastService.getPodcast(123L));
  }
}
