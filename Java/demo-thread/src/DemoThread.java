public class DemoThread {

    // Main thread (Worker A)
    // Another thread (Worker B)
    public static void main(String[] args) throws Exception {
        int x = 3;
        x++;
        ++x;
        x += 1;
        System.out.println(x); // 6

    // create another thread
    // 1. Task, 2. Thread
    Runnable sayHelloTask = () -> System.out.println("Hello!");
    StringBuilder sb = new StringBuilder("");
    
    Runnable concatString10000Times = () -> {
        for (int i = 0; i < 10000; i++){
        sb.append("!");
    }
    System.out.println(sb.length());
    System.out.println(System.currentTimeMillis());
    //System.out.println(sb);
    };
    System.out.println(System.currentTimeMillis());
    Thread workerB = new Thread(sayHelloTask);
    workerB.start();
    System.out.println("B" + System.currentTimeMillis());
    // main thread executes a new Thread (workerB)
    // main thread proceed its own task first
    // main thread (workerA) -> workerB (workerB)
    System.out.println(sb.length());
    System.out.println("Programme end.");
    Thread workerC = new Thread(concatString10000Times);
    workerC.start();
    System.out.println("C" + System.currentTimeMillis());
    // main thread (workerA) -> workerB (workerB) -> workerC (workerC)
    }
}
