public class Detail {

    // Attribute
    private int menuOption_id;
    private String menuOption_name;
    private int menuOption_price;

    // Constructor
    public Detail(int menuOption_id, String menuOption_name, int menuOption_price) {
        this.menuOption_id = menuOption_id;
        this.menuOption_name = menuOption_name;
        this.menuOption_price = menuOption_price;
    }

    // Getter Method
    public int getMenuOptionId() {
        return menuOption_id;
    }

    public String getMenuOptionName() {
        return menuOption_name;
    }

     public int getMenuOptionPrice() {
        return menuOption_price;
    }

    // Setter Method
    public void setMenuOptionId(int menuOption_id) {
        this.menuOption_id = menuOption_id;
    }

    public void setMenuOptionName(String menuOption_name) {
        this.menuOption_name = menuOption_name;
    }

    public void setMenuOptionPrice(int menuOption_price) {
        this.menuOption_price = menuOption_price;
    }
}
