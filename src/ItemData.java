import java.util.ArrayList;

public class ItemData implements DataController<Item>{
    private static ItemData ourInstance = new ItemData();

    public static ItemData getInstance() {
        return ourInstance;
    }

    private ItemData() {
    }

    @Override
    public void create(Item item) {

    }

    @Override
    public void update(Item item) {

    }

    @Override
    public Item get(String id) {
        return null;
    }

    @Override
    public ArrayList<Item> getAll() {
        return new ArrayList<>();
    }
}
