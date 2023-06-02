package easy.bot.repository;

import easy.bot.entity.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class ItemRepository implements CrudRepository<Item, Long> {
}
