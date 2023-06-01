package easy.bot.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "HARD_DISK")
public class HardDisk extends Type{
    private int volume;
}
