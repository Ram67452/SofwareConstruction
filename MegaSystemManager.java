package RefectoredCode;

public class MegaSystemManager {

    private final DiscountService discountService = new DiscountService();
    private final ShippingServices shippingService = new ShippingServices();
    private final LoggerService logger = new LoggerService();
    private final SettingsService settings = new SettingsService();
    private final ReportService reportService = new ReportService();
    private final NotificationService notifier = new NotificationService();
    private final UserInfoService userInfoService = new UserInfoService();

    private final double BASE_A = 10;
    private final double BASE_B = 20;

    public void processOrder(Order order) {

        logger.addLog("Start:" + order.getUserName());

        order.applyUrgentRule();

        double total = order.calculateTotal(BASE_A, BASE_B);

        total = discountService.applyDiscount(settings.userType, total);

        reportService.printOrderDetails(order, total);
        reportService.printSummary(order, total);

        logger.addLog("End:" + order.getUserName());
    }

    public static void main(String[] args) {

        MegaSystemManager manager = new MegaSystemManager();

        manager.settings.loadSettings("settings.conf");

        // ---- FIXED: NEW ORDER CREATION ----

        OrderDate date = new OrderDate(12, 11, 2025);

        OrderInfo info = new OrderInfo(
                "Ali",
                101,
                2,
                999.99,
                "Karachi",
                OrderType.URGENT,      // ← boolean removed
                "Handle carefully",
                date                   // ← day/month/year removed
        );

        Order order = new Order(info);

        manager.processOrder(order);

        manager.userInfoService.printUser("Ali", 25);

        manager.notifier.notifyUser("Ali",
                "Your order has been processed successfully!");

        manager.logger.exportLogs("logs.txt");
    }
}
