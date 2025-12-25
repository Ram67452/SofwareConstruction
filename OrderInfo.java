package RefectoredCode;

public class OrderInfo {

    private String userName;
    private int productId;
    private int quantity;
    private double price;
    private String address;
    private OrderType orderType;   // ← boolean removed
    private String notes;
    private OrderDate orderDate;

    public OrderInfo(
            String userName,
            int productId,
            int quantity,
            double price,
            String address,
            OrderType orderType,   // ← enum instead of boolean
            String notes,
            OrderDate orderDate
    ) {
        this.userName = userName;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.address = address;
        this.orderType = orderType;
        this.notes = notes;
        this.orderDate = orderDate;
    }

    public String getUserName() { return userName; }
    public int getProductId() { return productId; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
    public String getAddress() { return address; }
    public OrderType getOrderType() { return orderType; }
    public String getNotes() { return notes; }
    public OrderDate getOrderDate() { return orderDate; }
}
