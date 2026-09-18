package Com.Clothing;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Clothing {
    private final String name;
    private final Size size;
    private final BigDecimal unitPrice;
    private final Material material;

    protected Clothing(String name, Size size, BigDecimal unitPrice, Material material) {
        this.name = Objects.requireNonNull(name);
        this.size = Objects.requireNonNull(size);
        this.unitPrice = Objects.requireNonNull(unitPrice);
        this.material = Objects.requireNonNull(material);
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public Material getMaterial() {
        return material;
    }
}