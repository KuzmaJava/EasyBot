package easy.bot.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue(value = "DESKTOP")
public class Desktop extends Type {
    @Enumerated(value = EnumType.STRING)
    private DesktopType desktopType;

    public Desktop() {
    }

    public Desktop(DesktopType desktopType) {
        this.desktopType = desktopType;
    }
}
