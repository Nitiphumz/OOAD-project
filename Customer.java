import java.util.ArrayList;

public class Customer {

    private int customerId;
    private ArrayList<Integer> cusIdList = new ArrayList<>();
    private ArrayList<String> cusPhoneNumList = new ArrayList<>();
    private ArrayList<String> cusNameList = new ArrayList<>();
    private ArrayList<Integer> pointEarnedList = new ArrayList<>();

    public Customer() {
    }

    // Getter Methods
    public ArrayList<Integer> getCusID() {
        return cusIdList;
    }

    public ArrayList<String> getCusPhoneNum() {
        return cusPhoneNumList;
    }

    public String getCusName(int cusId) {
        int index = cusIdList.indexOf(cusId);
        return (index != -1) ? cusNameList.get(index) : "Customer ID not found";
    }

    public int getPointEarned(int cusId) {
        int index = cusIdList.indexOf(cusId);
        return (index != -1) ? pointEarnedList.get(index) : 0;
    }

    // Setter Methods

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    
    public void addCusID(int newCusID) {
        this.cusIdList.add(newCusID);
    }

    public void addCusPhoneNum(String newCusPhoneNum) {
        this.cusPhoneNumList.add(newCusPhoneNum);
    }

    public void addCusName(String newCusName) {
        this.cusNameList.add(newCusName);
    }

    public void addPointEarned(int newPointEarned) {
        this.pointEarnedList.add(newPointEarned);
    }

    public void setPointEarned(int cusId, int newPoints) {
        int index = cusIdList.indexOf(cusId);
        if (index != -1) {
            pointEarnedList.set(index, newPoints);
        } else {
            System.out.println("Customer ID not found");
        }
    }

    // Other Methods

    private int lastAssignedId = 0;

    public void register(String newCusPhoneNum, String newCusName) {

        lastAssignedId++;

        cusIdList.add(lastAssignedId);
        cusPhoneNumList.add(newCusPhoneNum);
        cusNameList.add(newCusName);
        pointEarnedList.add(0);

        System.out.println("--------------------------------------");
        System.out.println("Registration successful for " + newCusName);
        System.out.println("--------------------------------------");
    }

    public int calculateTotalPoints(int cusId) {
        int index = cusIdList.indexOf(cusId);
        if (index != -1) {
            return pointEarnedList.get(index);
        } else {
            System.out.println("Customer ID not found");
            return 0;
        }
    }

    public void deductPoints(int points) {
        int currentPoints = pointEarnedList.get(customerId);  // 
        pointEarnedList.set(customerId, currentPoints - points);
    }
    
    
    public boolean login(String enteredCusPhoneNum) {
        return cusPhoneNumList.contains(enteredCusPhoneNum);
    }
    
}
