package Com.Clothing;

import java.math.BigDecimal;

public class Bottom extends Clothing {
    private final int waist;

    public Bottom(String name, Size size, BigDecimal unitPrice, Material material, int waist) {
        super(name, size, unitPrice, material);
        this.waist = waist;
    }

    public int getWaist() {
        return waist;
    }
}