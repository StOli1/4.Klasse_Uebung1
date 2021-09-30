import java.util.Date;

/*****
 * author: Oliver Steiner
 * date: 30.08.2021
 * version: 1.0
 */

public class DatePrinter implements Runnable{

    Date date = new Date();

    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            System.out.println(date);
        }
    }
}
