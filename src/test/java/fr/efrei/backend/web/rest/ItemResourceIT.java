package fr.efrei.backend.web.rest;

import fr.efrei.backend.repository.ItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
public class ItemResourceIT {
  @Autowired
  private ItemRepository itemRepository;

  @Test
  @Transactional
  void createItem() throws Exception {
    int databaseSizeBeforeCreate = itemRepository.findAll().size();   
    assertThat(databaseSizeBeforeCreate).isEqualTo(5);
  }
}
