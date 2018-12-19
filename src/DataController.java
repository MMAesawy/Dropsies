import java.util.ArrayList;

public interface DataController <T> {
    void create(T t);
    void update(T t);
    T get(String id);
    ArrayList<T> getAll();
}
