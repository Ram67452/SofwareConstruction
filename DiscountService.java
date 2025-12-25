package RefectoredCode;

public class DiscountService {

    public double applyDiscount(UserType type, double amount) {

        switch (type) {
            case REGULAR -> amount -= 10;
            case PREMIUM -> amount -= 2;
            case VIP -> amount -= 1;
        }
        return amount;
    }
}
