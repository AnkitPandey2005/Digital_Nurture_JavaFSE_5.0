package Exercise_2_E_commerce_Platform_Search_Function;

public class Item {

    int id;
    String name;
    String category;

    public Item(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String display() {
        return "ID : " + id +
                "\nName : " + name +
                "\nCategory : " + category;
    }
}
