package RefectoredCode;

import java.io.File;
import java.util.Scanner;

public class SettingsService {

    public UserType userType = UserType.REGULAR;
    public PaymentType paymentType = PaymentType.CASH;

    public void loadSettings(String fileName) {
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);

            while (s.hasNextLine()) {
                String line = s.nextLine();

                if (line.startsWith("U")) {
                    userType = UserType.valueOf(line.substring(2));
                }

                if (line.startsWith("P")) {
                    paymentType = PaymentType.valueOf(line.substring(2));
                }
            }

        } catch (Exception e) {
            System.out.println("Settings not loaded");
        }
    }
}
