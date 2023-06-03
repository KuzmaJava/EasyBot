package easy.bot.repository;

import easy.bot.entity.Category;
import easy.bot.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
    List<Item> findAllByCategory(Optional<Category> category);
}
