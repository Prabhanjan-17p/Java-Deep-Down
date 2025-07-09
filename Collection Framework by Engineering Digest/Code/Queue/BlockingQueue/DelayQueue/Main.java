package Queue.BlockingQueue.DelayQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /*
        ✅ What is DelayQueue?
        ----------------------------------------
        - A **thread-safe**, unbounded **blocking queue** of elements that implement the `Delayed` interface.
        - An element can only be **taken when its delay expires**.
        - Internally backed by a **PriorityQueue**.

        ❓ Why it was introduced:
        ----------------------------------------
        - To schedule tasks with a delay or timeout without custom thread management.
        - Useful in **task scheduling**, **retries**, **timeout handling**, or **rate-limiting**.

        ⚠️ The Problem:
        ----------------------------------------
        - Standard queues don't support delaying element retrieval.
        - Manual implementation of timers with traditional queues is error-prone.

        🔧 The Fix – DelayQueue:
        ----------------------------------------
        - Automatically blocks `take()` until the delay of the head element expires.
        - Removes the need for custom thread-wait logic.
        - Scales well for time-based scheduling.
        */

        // ✅ Using DelayQueue to schedule delayed tasks
        BlockingQueue<DelayedTask> delayQueue = new DelayQueue<>();

        delayQueue.put(new DelayedTask("Task1", 5, TimeUnit.SECONDS));
        delayQueue.put(new DelayedTask("Task2", 3, TimeUnit.SECONDS));
        delayQueue.put(new DelayedTask("Task3", 10, TimeUnit.SECONDS));

        System.out.println("🕒 Starting to poll tasks at: " + System.currentTimeMillis());

        while (!delayQueue.isEmpty()) {
            DelayedTask task = delayQueue.take(); // Blocks until delay expires
            System.out.println("✅ Executed: " + task.getTaskName() + " at " + System.currentTimeMillis());
        }
    }
}

// ✅ Custom Delayed Task
class DelayedTask implements Delayed {

    private final String taskName;
    private final long startTime; // When the task should become available

    public DelayedTask(String taskName, long delay, TimeUnit unit) {
        this.taskName = taskName;
        this.startTime = System.currentTimeMillis() + unit.toMillis(delay);
    }

    // 🔄 How much delay remains
    @Override
    public long getDelay(TimeUnit unit) {
        long remaining = startTime - System.currentTimeMillis();
        return unit.convert(remaining, TimeUnit.MILLISECONDS);
    }

    // 🔢 Comparison for ordering in queue
    @Override
    public int compareTo(Delayed other) {
        if (this.startTime < ((DelayedTask) other).startTime) return -1;
        if (this.startTime > ((DelayedTask) other).startTime) return 1;
        return 0;
    }

    public String getTaskName() {
        return taskName;
    }
}
