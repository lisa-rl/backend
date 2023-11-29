package fr.efrei.backend.service;

import fr.efrei.backend.domain.Item;
import fr.efrei.backend.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

  public final ItemRepository itemRepository;

  public ItemService(ItemRepository itemRepository) {
    this.itemRepository = itemRepository;
  }

  public List<Item> findAll() {
    return itemRepository.findAll();
  }
}
