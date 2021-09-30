/*****
 * author: Oliver Steiner
 * date: 30.08.2021
 * version: 1.0
 */

public class CountPrinter implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            System.out.println(i+1);
        }
    }
}
