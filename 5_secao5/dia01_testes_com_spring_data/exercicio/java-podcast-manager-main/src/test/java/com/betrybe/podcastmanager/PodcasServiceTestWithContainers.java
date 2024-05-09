package com.betrybe.podcastmanager;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import com.betrybe.podcastmanager.entity.Podcast;
import com.betrybe.podcastmanager.repository.PodcastRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@AutoConfigureMockMvc
@Testcontainers
public class PodcasServiceTestWithContainers {
  @Autowired
  PodcastRepository podcastRepository;

  @Autowired
  MockMvc mockMvc;

  @Container
  public static MySQLContainer MYSQL_CONTAINER = new MySQLContainer("mysql:8.0.32")
      .withDatabaseName("podcast");

  @DynamicPropertySource
  public static void overideProperties(DynamicPropertyRegistry registry) {
    registry.add("spring.datasource.url", MYSQL_CONTAINER::getJdbcUrl);
    registry.add("spring.datasource.username", MYSQL_CONTAINER::getUsername);
    registry.add("spring.datasource.password", MYSQL_CONTAINER::getPassword);
  }

  @Test
  public void testPodcastCreate() throws Exception {
    Podcast podcast = new Podcast();
    podcast.setName("newPod");
    podcast.setUrl("www.newPod.com.br");

    Podcast savePod = podcastRepository.save(podcast);

    String podUrl = "/podcasts/" + podcast.getId();
    mockMvc.perform(get(podUrl))
        .andExpect(jsonPath("$.name").value("newPod"))
        .andExpect(jsonPath("$.url").value("www.newPod.com.br"));
  }
}
