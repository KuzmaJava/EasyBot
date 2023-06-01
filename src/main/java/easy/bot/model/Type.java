package easy.bot.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "TYPE",
        discriminatorType = DiscriminatorType.STRING
)
public abstract class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String manufacturer;

    private BigDecimal price;

    private int quantity;
}
