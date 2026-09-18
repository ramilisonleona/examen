package Com.Clothing;

import java.math.BigDecimal;

public class Top extends Clothing {
    private final Sleeves sleeves;

    public Top(String name, Size size, BigDecimal unitPrice, Material material, Sleeves sleeves) {
        super(name, size, unitPrice, material);
        this.sleeves = sleeves;
    }

    public Sleeves getSleeves() {
        return sleeves;
    }
}