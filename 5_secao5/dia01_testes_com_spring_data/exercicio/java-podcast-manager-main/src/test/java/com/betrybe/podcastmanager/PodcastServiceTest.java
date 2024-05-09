package com.betrybe.podcastmanager;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

import com.betrybe.podcastmanager.entity.Podcast;
import com.betrybe.podcastmanager.exception.PodcastNotFoundException;
import com.betrybe.podcastmanager.repository.PodcastRepository;
import com.betrybe.podcastmanager.service.PodcastService;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.mockito.Mockito;

@SpringBootTest
public class PodcastServiceTest {
  @Autowired
  PodcastService podcastService;

  @MockBean
  PodcastRepository podcastRepository;

  @Test
  public void testPodcastCreation() {
    Podcast podcast = new Podcast();
    podcast.setName("NovoPod");
    podcast.setUrl("www.newPod.com.br");

    Podcast podResponse = new Podcast();
    podResponse.setId(123L);
    podResponse.setName(podcast.getName());
    podResponse.setUrl(podcast.getUrl());

    Mockito.when(podcastRepository.save(any())).thenReturn(podResponse);

    Podcast savePod = podcastService.createPodcast(podcast);

    Mockito.verify(podcastRepository).save(any());

    assertEquals(123L, savePod.getId());
    assertEquals(podcast.getName(), savePod.getName());
    assertEquals(podcast.getUrl(), savePod.getUrl());
  }

  @Test
  public void testProductRetrieval() {
    Podcast podcast = new Podcast();
    podcast.setId(123L);
    podcast.setName("NovoPod");
    podcast.setUrl("www.newPod.com.br");

    Mockito.when(podcastRepository.findById(eq(123L))).thenReturn(Optional.of(podcast));

    Podcast responsePod = podcastService.getPodcast(123L);

    Mockito.verify(podcastRepository).findById(eq(123L));

    assertEquals(responsePod.getId(), podcast.getId());
    assertEquals(responsePod.getName(), responsePod.getName());
    assertEquals(responsePod.getUrl(), responsePod.getUrl());
  }

  @Test
  public void testException() {
    Mockito.when(podcastRepository.findById(any())).thenReturn(Optional.empty());

    assertThrows(PodcastNotFoundException.class, () -> podcastService.getPodcast(123L));

    Mockito.verify(podcastRepository).findById(eq(123L));
  }
}
