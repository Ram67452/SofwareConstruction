package RefectoredCode;

public class ReportService {

    public void printOrderDetails(Order order, double total) {

        System.out.println("----- ORDER REPORT -----");
        System.out.println("User: " + order.getUserName());
        System.out.println("Product ID: " + order.getProductId());
        System.out.println("Quantity: " + order.getQuantity());
        System.out.println("Total: " + total);
        System.out.println("Date: " + order.getDate());
    }

    public void printSummary(Order order, double total) {
        System.out.println("----- SUMMARY -----");
        System.out.println("User: " + order.getUserName());
        System.out.println("Total: " + total);
    }
}
