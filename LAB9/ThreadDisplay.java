class BMSCollegeThread extends Thread {
    public void run() {
        try {
            for(int i=0;i<5;i++) {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            System.out.println("BMSCollegeThread interrupted.");
        }
    }
}

class CSEThread extends Thread {
    public void run() {
        try {
            for(int i=0;i<5;i++) {
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("CSEThread interrupted.");
        }
    }
}

public class ThreadDisplay {
    public static void main(String[] args) {
        BMSCollegeThread bmsThread = new BMSCollegeThread();
        CSEThread cseThread = new CSEThread();

        bmsThread.start();
        cseThread.start();
        System.out.println("Daivya Priyankkumar Shah");
        System.out.println("1BM23CS084");
    }
}
