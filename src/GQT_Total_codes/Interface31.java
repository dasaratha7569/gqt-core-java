package GQT_Total_codes;
interface Runnable1 {
    void run();
}

interface Callable {
    void call();
}

class ThreadClass implements Runnable1 {
    public void run() { System.out.println("Thread is running..."); }
}

class TaskClass implements Callable {
    public void call() { System.out.println("Task is being executed..."); }
}
public class Interface31 {
    public static void main(String[] args) {
        ThreadClass thread = new ThreadClass();
        thread.run();

        TaskClass task = new TaskClass();
        task.call();
    }
}