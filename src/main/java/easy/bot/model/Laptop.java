package easy.bot.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "LAPTOP")
public class Laptop extends Type{
    private int laptopSize;
}
