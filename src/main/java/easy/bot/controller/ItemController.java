package easy.bot.controller;

import easy.bot.entity.Category;
import easy.bot.entity.Item;
import easy.bot.repository.CategoryRepository;
import easy.bot.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/store/items")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("")
    public List<Item> getAllItems() {
        return (List<Item>) itemRepository.findAll();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Item createItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Item> updateItem(@PathVariable("id") long id, @RequestBody Item item) {
        Optional<Item> itemData = itemRepository.findById(id);

        if (itemData.isPresent()) {
            Item newItem = new Item();
            newItem.setId(item.getId());
            newItem.setPrice(item.getPrice());
            newItem.setQuantity(item.getQuantity());
            newItem.setCategory(item.getCategory());
            newItem.setDescription(item.getDescription());
            itemRepository.deleteById(id);
            return new ResponseEntity<>(itemRepository.save(newItem), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getById/{id}")
    public Optional<Item> getItemById(@PathVariable("id") long id) {
        return itemRepository.findById(id);
    }

    @GetMapping("/findByType/{id}")
    public List<Item> getAllItemsByType(@PathVariable("id") long categoryId) {
        return itemRepository.findAllByCategory(categoryRepository.findById(categoryId));
    }
}
