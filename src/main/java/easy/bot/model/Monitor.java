package easy.bot.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "MONITOR")
public class Monitor extends Type{
    private long inchDiagonal;
}
