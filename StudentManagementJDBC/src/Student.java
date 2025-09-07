public class Student {
    private int id;
    private String name;
    private String email;
    private int age;
    private String course;
    private String department;

    // Constructors
    public Student() {}
    public Student(String name, String email, int age, String course, String department) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.course = course;
        this.department = department;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + email + " | " + age + " | " + course + " | " + department;
    }
}
