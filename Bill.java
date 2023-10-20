public class Bill {

    // Attribute
    private String bill_date;

    // Composition
    private Order order;
    private Customer customer;
    private Staff staff;
    
    public Bill() {

    }
    
    // Constructor
    public Bill(String bill_date, Order order, Customer customer, Staff staff) {
        this.bill_date = bill_date;
        this.order = order;
        this.customer = customer;
        this.staff = staff;
    }

    // Getter Method
    public String getBillDate() {
        return bill_date;
    }

    public Order getOrder() {
        return order;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Staff getStaff() {
        return staff;
    }

    // Setter Method
    public void setBillDate(String bill_date) {
        this.bill_date = bill_date;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    // Other methods
    public void showBill(){

    }

    public void payBill(int pointEarned){

    }
}
