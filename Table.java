public class Table {

    // Attribute
    private int table_num;
    private String table_name;

    // Constructor
    Table(int table_num, String table_name) {
        this.table_num = table_num;
        this.table_name = table_name;
    }

    // Getter Method
    public int getTableNum() {
        return table_num;
    }

    public String getTableName() {
        return table_name;
    }

    // Setter Method
    public void setTableNum(int Table_num) {
        this.table_num = Table_num;
    }

    public void setTableName(String Table_name) {
        this.table_name = Table_name;
    }

    public void add(int numTable) {
    }
}
