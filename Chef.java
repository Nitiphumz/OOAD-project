public class Chef extends Staff {

    // Attribute
    private String expert;

    // Constructor
    Chef(String ID, String username, String password, String expert) {
        super(ID, username, password);
    }

    // Getter Method
    public String getChefID() {
        return getID();
    }

    public String getChefName() {
        return getUsername();
    }

    public String getChefPassword() {
        return getPassword();
    }

    public String getExpertise() {
        return expert;
    }

    // Setter Method
    public void addChefID(String ID) {
        addID(ID);
    }

    public void addChefName(String ID) {
        addName(ID);
    }

    public void addChefPassword(String ID) {
        addPassword(ID);
    }

    public void addExpertise(String expertise) {
        this.expert = expertise;
    }

    // Other Method
    public void showChefInfo() {
        System.out.println("Chef Name: " + getChefName());
        System.out.println("Expertise: " + getExpertise());
    }
    
}
