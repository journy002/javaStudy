package access.ex;

public class MaxCounter {
    private int count = 0;
    int maxCount;

    MaxCounter(int maxCount) {
        this.maxCount = maxCount;
    }

    public void increment() {
        if (maxCount > count) {
            count++;
        } else {
            System.out.println("증가값 초과.");
        }
    }

    public int getCount() {
        return count;
    }

}
