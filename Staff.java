public class Staff {

    // Attribute
    private String staff_id;
    private String staff_username;
    private String staff_password;

    // Constructor
    Staff(String ID, String username, String password) {
        this.staff_id = ID;
        this.staff_username = username;
        this.staff_password = password;
    }

    public Staff(){

    }
    
    // Getter methods if needed
    public String getID() {
        return staff_id;
    }
    
    public String getUsername() {
        return staff_username;
    }
    
    public String getPassword() {
        return staff_password;
    }

    // Setter methods
    public void addID(String ID) {
        this.staff_id = ID;
    }

    public void addName(String username) {
        this.staff_username = username;
    }

    public void addPassword(String password) {
        this.staff_password = password;
    }

    // Other methods
    public boolean login(String enteredUsername, String enteredPassword) {
        return this.staff_username.equals(enteredUsername) && this.staff_password.equals(enteredPassword);
    }
}
