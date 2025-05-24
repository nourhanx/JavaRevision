public class PrintNum implements Runnable {
    int lastNum;
    PrintNum(int n) {
        lastNum = n;
    }
    public void run() {
        for (int i = 1; i <= lastNum; i++) {
            System.out.println(i + "\n");
        }
    }
}
