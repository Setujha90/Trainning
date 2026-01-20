package Day10_Assignment_has_a;


class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }
}

class School {
    Teacher teacher;

    School(Teacher teacher) {
        this.teacher = teacher;
    }

    void display() {
        System.out.println("Teacher: " + teacher.name);
    }
}

public class TestAggregation2 {
    public static void main(String[] args) {
        Teacher t = new Teacher("Setu Kumar");
        School s = new School(t);
        s.display();
    }
}
