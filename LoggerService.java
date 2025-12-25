package RefectoredCode;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class LoggerService {

    private final List<String> logs = new ArrayList<>();

    public void addLog(String msg) {
        logs.add(msg);
    }

    public void exportLogs(String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName);
            for (String s : logs) fw.write(s + "\n");
            fw.close();
        } catch (Exception e) {
            System.out.println("Error writing logs");
        }
    }
}
