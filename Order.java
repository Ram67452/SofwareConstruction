

package RefectoredCode;

import java.time.LocalDate;

public class Order {

    private final String userName;
    private final int productId;
    private int quantity;
    private final double price;
    private final String address;
    private final OrderType orderType;   // updated
    private final String notes;
    private final LocalDate date;

    public Order(OrderInfo info) {

        this.userName = info.getUserName();
        this.productId = info.getProductId();
        this.quantity = info.getQuantity();
        this.price = info.getPrice();
        this.address = info.getAddress();
        this.orderType = info.getOrderType();  // updated enum
        this.notes = info.getNotes();

        // date fix
        this.date = LocalDate.of(
                info.getOrderDate().getYear(),
                info.getOrderDate().getMonth(),
                info.getOrderDate().getDay()
        );
    }

    public void applyUrgentRule() {
        if (orderType == OrderType.URGENT) {
            quantity += 1;
        }
    }

    public double calculateTotal(double baseA, double baseB) {
        return (quantity * price) + baseA + baseB;
    }

    // Getters
    public String getUserName() { return userName; }
    public int getProductId() { return productId; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
    public LocalDate getDate() { return date; }
}
