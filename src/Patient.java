public class Patient {
    // Attributes
    private static int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private String blood;
    private double weight;
    private double height;


    // Constructor
    Patient(String name, String email) {
        id++;
        this.name = name;
        this.email = email;
    }


    // Getters and Setters
    public static int getId() {
        return id;
    }
    
    public static void setId(int id) {
        Patient.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() > 8){
            System.out.println("Please enter a valid phone number");
        } else if(phoneNumber.length() < 8) {
            System.out.println("Please enter a valid phone number");
        } else if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
    }
    
    public String getBirthday() {
        return birthday;
    }
    
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    
    public String getBlood() {
        return blood;
    }
    
    public void setBlood(String blood) {
        this.blood = blood;
    }
    
    public String getHeight() {
        return height + " Mts.";
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public String getWeight(){
        return this.weight + " Kg.";
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
