public class TaskThreadDemo {
    public static void main(String[] args) {
       PrintNum task1 = new PrintNum(100);
       PrintChar task2 = new PrintChar('a', 100);
       PrintChar task3 = new PrintChar('b', 100);

       Thread thread1 = new Thread(task1);
       Thread thread2 = new Thread(task2);
       Thread thread3 = new Thread(task3);

       thread1.start();
       thread2.start();
       thread3.start();
    }
}
