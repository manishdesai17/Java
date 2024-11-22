class OddThread extends Thread {
    public void run() {
        try {
            int i;
            for (i = 0; i <= 10; i++) {
                if (i % 2 != 0) {
                    sleep(1000);
                    System.out.println("i=" + i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class PrimeThread implements Runnable {
    public void run() {
        int i,j;
        try {
            for (i = 1; i <= 10; i++) {
                for (j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        break;
                    }
                 
                }
                if (i == j) {
                    Thread.sleep(1000);
                    System.out.println("j=" + j);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class p13 {
    public static void main(String[] args) {
        OddThread od = new OddThread();
        od.start();
        PrimeThread pd = new PrimeThread();
        Thread t = new Thread(pd);
        t.start();
    }
}
