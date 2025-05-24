public class PrintChar implements Runnable{
    private Character c;
    private int n;

    PrintChar(Character c, int n) {
        this.c = c;
        this.n = n;
    }
    public void run(){
        for (int i = 0; i < n; i++) {
            System.out.println(c);
        }
    }
}
