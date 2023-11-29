package fr.efrei.backend.web.rest;

import fr.efrei.backend.domain.Item;
import fr.efrei.backend.repository.ItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
public class ItemResourceIT {
  @Autowired
  private ItemRepository itemRepository;

  @Test
  @Transactional
  void createItem() throws Exception {
    int databaseSizeBeforeCreate = itemRepository.findAll().size();   
    assertThat(databaseSizeBeforeCreate).isEqualTo(0);

    Item item = new Item();
    item.setName("Pierre");
    itemRepository.save(item);

    List<Item> items = itemRepository.findAll();
    assertThat(items).hasSize(databaseSizeBeforeCreate + 1);
  }
}
