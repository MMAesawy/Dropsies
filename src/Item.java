import java.awt.Image;

public class Item {
    private static int idPool = 0;
    private String name;
    private String description;
    private String locationFound;
    private Image itemImage;
    private String id;

    public Item(String name, String description, String locationFound) {
        this.name = name;
        this.description = description;
        this.locationFound = locationFound;
        id = "" + idPool++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocationFound() {
        return locationFound;
    }

    public void setLocationFound(String locationFound) {
        this.locationFound = locationFound;
    }

    public Image getItemImage() {
        return itemImage;
    }

    public void setItemImage(Image itemImage) {
        this.itemImage = itemImage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
