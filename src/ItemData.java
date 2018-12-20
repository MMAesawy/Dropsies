import java.util.ArrayList;

public class ItemData implements DataController<Item>{
    private static ItemData ourInstance = new ItemData();
    private ArrayList<Item> items = new ArrayList<>();

    public static ItemData getInstance() {
        return ourInstance;
    }

    private ItemData() {
        initializeData();
    }

    private void initializeData(){
        items.add(new Item(
                "Zamzameya",
                "A water container",
                "Giza"
        ));
        items.add(new Item(
                "Laptop Alienware",
                "Has a Kony2012 sticker",
                "Dreampark"
        ));
        items.add(new Item(
                "Hydraulic Press",
                "Crushes things",
                "Finland"
        ));
        items.add(new Item(
                "Lipstick",
                "Sticks on lips",
                "FCI"
        ));
        items.add(new Item(
                "One Million Dollars",
                "In a briefcase",
                "Ali baba's cave"
        ));
        items.add(new Item(
                "Magnetic Monopole",
                "Has one pole",
                "CERN"
        ));
        items.add(new Item(
                "The Holy Grail",
                "It's like a cup",
                "Jerusalem"
        ));
        items.add(new Item(
                "Happiness",
                "Makes funny tingles",
                "Not in life"
        ));
    }

    @Override
    public void create(Item item) {
        if (get(item.getId()) == null)
            items.add(item);
    }

    @Override
    public void update(Item item) {
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).getId().equals(item.getId())){
                items.set(i, item);
                break;
            }
        }
    }

    @Override
    public Item get(String id) {
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).getId().equals(id)){
                return items.get(i);
            }
        }
        return null;
    }

    @Override
    public ArrayList<Item> getAll() {
        return items;
    }
}
