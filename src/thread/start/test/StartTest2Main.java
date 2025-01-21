package thread.start.test;

import static util.MyLogger.log;

public class StartTest2Main {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> log("run()"), "counter");
        thread.start();
    }
}
