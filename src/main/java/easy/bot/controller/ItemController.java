package easy.bot.controller;

import easy.bot.entity.Item;
import easy.bot.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store")
public class ItemController {

    private ItemRepository itemRepository;

    @GetMapping("/items")
    public List<Item> getAllEmployees() {
        return (List<Item>) itemRepository.findAll();
    }

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
}
