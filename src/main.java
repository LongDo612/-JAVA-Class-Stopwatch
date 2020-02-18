import java.time.LocalTime;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        Stopwatch s = new Stopwatch();
        s.start();
        System.out.println(s.getStartTime());
        System.out.println(s.getElapsedTime());
        s.stop();
        System.out.println(s.getEndTime());
    }
}
