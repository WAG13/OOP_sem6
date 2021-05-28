package task6;

public interface MyReadWriteLock {
    void lockReader();
    void unlockReader();
    void lockWriter();
    void unlockWriter();
}
