public class Student {
    private String name;
    private int studentID;
    private Student buddy;
    private City hometown;

    public Student(int studentID, String name){
        this.name = name;
        this.studentID = studentID;
    }

    public String reportBuddyName(){
        return buddy.getName();
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public Student getBuddy() {
        return buddy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setBuddy(Student buddy) {
        this.buddy = buddy;
    }

    public City getHometown() {
        return hometown;
    }

    public void setHometown(City hometown) {
        this.hometown = hometown;
    }
}
