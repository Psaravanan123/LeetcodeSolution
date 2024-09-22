import java.util.concurrent.CountDownLatch;

class Foo {
    private CountDownLatch latchSecond;
    private CountDownLatch latchThird;

    public Foo() {
        latchSecond = new CountDownLatch(1);  // To control second
        latchThird = new CountDownLatch(1);   // To control third
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // Print "first"
        printFirst.run();
        // Release the latch for second
        latchSecond.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // Wait for first to complete
        latchSecond.await();
        // Print "second"
        printSecond.run();
        // Release the latch for third
        latchThird.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        // Wait for second to complete
        latchThird.await();
        // Print "third"
        printThird.run();
    }
}
