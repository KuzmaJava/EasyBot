package easy.bot.controller;

import easy.bot.entity.Item;
import easy.bot.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/items")
    public List<Item> getAllEmployees() {
        return (List<Item>) itemRepository.findAll();
    }

    @PostMapping("/add")
    public Item createEmployee(@RequestBody Item item) {
        return itemRepository.save(item);
    }


}
