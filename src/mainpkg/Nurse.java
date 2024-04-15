package mainpkg;

public class Nurse {
    private String name;
    private String id;
    private String phoneNumber;
    private String bloodGroup;
    private int age;

    public Nurse(String name, String id, String phoneNumber, String bloodGroup, int age) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.bloodGroup = bloodGroup;
        this.age = age;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getBloodGroup() { return bloodGroup; }
    public void setBloodGroup(String bloodGroup) { this.bloodGroup = bloodGroup; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
