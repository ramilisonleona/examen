package Com.Clothing;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Order {
    private final LocalDate orderDate;
    private final String description;
    private final List<OrderItem> items = new ArrayList<>();

    public Order(LocalDate orderDate, String description) {
        this.orderDate = Objects.requireNonNull(orderDate);
        this.description = Objects.requireNonNull(description);
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getDescription() {
        return description;
    }

    public void addItem(OrderItem item) {
        items.add(Objects.requireNonNull(item));
    }

    public List<OrderItem> getItems() {
        return Collections.unmodifiableList(items);
    }


    public BigDecimal getTotalAmount() {
        return items.stream()
                .map(OrderItem::getSubtotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}