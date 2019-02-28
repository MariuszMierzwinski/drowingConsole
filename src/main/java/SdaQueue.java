public interface SdaQueue {

    void add(Box element);

    String get();

    boolean isEmpty();

    int count();
}
