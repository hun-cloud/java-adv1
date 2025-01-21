package thread.start;

import util.MyLogger;

import static util.MyLogger.log;

public class InnerRunnableMainV1 {

    public static void main(String[] args) {
        log("main() start");
        MyRunner myRunner = new MyRunner();
        Thread thread = new Thread(myRunner);
        thread.start();
        log("main() end");
    }

    static class MyRunner implements Runnable {

        @Override
        public void run() {
            log("run()");
        }
    }
}
