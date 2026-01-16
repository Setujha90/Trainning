package Day6Assignment;

//Example of Encapsulation
public class TestStudent {
    public static void main(String[] args) {

        Student s = new Student();

        s.setRollNo(101);
        s.setName("Setu");
        s.setMarks(85);

        System.out.println(s.getRollNo());
        System.out.println(s.getName());
        System.out.println(s.getMarks());
    }
}

class Student {

    private int rollNo;
    private String name;
    private double marks;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100)
            this.marks = marks;
        else
            System.out.println("Invalid marks");
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }
}

