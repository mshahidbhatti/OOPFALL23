package week03_b;

public class Student {
    private String name;
    private String regNo;

    public Student(String name, String regNo) {
        this.name = name;
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public boolean compare(Student std){
        return this.name==std.name&&this.regNo==std.regNo;
    }

     boolean equals(Student std){
        return this.name==std.name&&this.regNo==std.regNo;

    }
    public boolean equals(Object o){
        Student std=(Student) o;
        return this.name==std.name&&this.regNo==std.regNo;
    }

    @Override
    public String toString() {
        return "";
    }
}
