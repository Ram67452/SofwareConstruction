package RefectoredCode;

public class ShippingServices {

    public int calculateShipping(int distance) {
        if (distance < 10) return 50;
        if (distance < 50) return 100;
        if (distance < 100) return 150;
        return 200;
    }
}
