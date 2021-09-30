/*****
 * author: Oliver Steiner
 * date: 30.08.2021
 * version: 1.0
 */

public class Main {
    public static void main(String[] args) {
        DatePrinter datePrinter = new DatePrinter();
        CountPrinter countPrinter = new CountPrinter();

        Thread thread1 = new Thread(datePrinter);
        Thread thread2 = new Thread(countPrinter);

        thread1.start();
        thread2.start();

        /**
         * (20) ein Thread wird immer als erstes komplett auf die Konsole ausgelesen.
         * (200) --""--
         * (2000) die Threads werden wahllos durcheinadner auf die Konsole ausgegeben
         **/
    }
}
