public class GroceryItem {
    private String type;
    private String name;
    private int count;

    public GroceryItem(String type, String name, int count) {
        this.type = type;
        this.name = name;
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "\nType: " + type + "\nName: " + name + "\nCount: " + count;
    }
}
