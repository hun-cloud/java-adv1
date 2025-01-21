package thread.control;

import thread.start.HelloRunnable;
import thread.start.HelloThread;
import util.MyLogger;

import static util.MyLogger.*;

public class ThreadInfoMain {

    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();
        log("main Thread = " + mainThread);
        log("mainThread.threadId" + mainThread.threadId());
        log("mainThread.getName()" + mainThread.getName());
        log("mainThread.getPriority()" + mainThread.getPriority());
        log("mainThread.getThreadGroup()" + mainThread.getThreadGroup());
        log("mainThread.getState()" + mainThread.getState());

        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("main Thread = " + myThread);
        log("mainThread.threadId" + myThread.threadId());
        log("mainThread.getName()" + myThread.getName());
        log("mainThread.getPriority()" + myThread.getPriority());
        log("mainThread.getThreadGroup()" + myThread.getThreadGroup());
        log("mainThread.getState()" + myThread.getState());
    }
}
