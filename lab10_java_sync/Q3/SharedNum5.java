package lab10_java_sync.Q3;

public class SharedNum5 {
    private int val;
    Object lock;

    SharedNum5(){
        val = 0;
        lock = new Object();
    }

    synchronized int getVal() {
        try {
            this.wait();
        } catch (InterruptedException ie) {}
        return val;
    }

    synchronized void setVal(int x) {
        val = x;
        this.notifyAll();
    }
}