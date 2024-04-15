package mainpkg;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Item {
    private final StringProperty itemId;
    private final StringProperty itemName;
    private final StringProperty quantity;

    public Item(String itemId, String itemName, String quantity) {
        this.itemId = new SimpleStringProperty(itemId);
        this.itemName = new SimpleStringProperty(itemName);
        this.quantity = new SimpleStringProperty(quantity);
    }

    // Getter methods
    public String getItemId() {
        return itemId.get();
    }

    public String getItemName() {
        return itemName.get();
    }

    public String getQuantity() {
        return quantity.get();
    }

    // Setter methods
    public void setItemId(String itemId) {
        this.itemId.set(itemId);
    }

    public void setItemName(String itemName) {
        this.itemName.set(itemName);
    }

    public void setQuantity(String quantity) {
        this.quantity.set(quantity);
    }

    // Property methods
    public StringProperty itemIdProperty() {
        return itemId;
    }

    public StringProperty itemNameProperty() {
        return itemName;
    }

    public StringProperty quantityProperty() {
        return quantity;
    }
}
