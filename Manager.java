public class Manager extends Staff {

    // Attribute
    private int otPayment;
    
    // Constructor
    Manager(String ID, String username, String password) {
        super(ID,username, password);
        
    }

    public String getManagerID() {
        return getID();
    }

    public String getManagerName() {
        return getUsername();
    }

    public String getManagerPassword() {
        return getPassword();
    }

    public int getOtPayment() {
        return otPayment;
    }

    // Setter Method
    public void addManagerID(String ID) {
        addID(ID);
    }

    public void addManagerName(String ID) {
        addName(ID);
    }

    public void addManagerPassword(String ID) {
        addPassword(ID);
    }

    public void addOtPayment(int otPayment) {
        this.otPayment = otPayment;
    }
}
    


