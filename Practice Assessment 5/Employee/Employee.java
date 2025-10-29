public class Employee {
    private int id;
    private String name;
    private String role;
    private int yearEmployed;

    public Employee(int id, String name, String role, int yearEmployed) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.yearEmployed = yearEmployed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getYearEmployed() {
        return yearEmployed;
    }

    public void setYearEmployed(int yearEmployed) {
        this.yearEmployed = yearEmployed;
    }
}
