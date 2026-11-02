import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        String formatted = now.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        System.out.println(formatted);
    
    }
}