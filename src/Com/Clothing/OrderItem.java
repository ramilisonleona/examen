package Com.Clothing;

import java.math.BigDecimal;
import java.util.Objects;

public class OrderItem {
    private final Clothing clothing;
    private final int quantity;

    public OrderItem(Clothing clothing, int quantity) {
        this.clothing = Objects.requireNonNull(clothing);
        if (quantity <= 0) throw new IllegalArgumentException("quantity must be > 0");
        this.quantity = quantity;
    }

    public Clothing getClothing() {
        return clothing;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getSubtotal() {
        return clothing.getUnitPrice().multiply(BigDecimal.valueOf(quantity));
    }
}