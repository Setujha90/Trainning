package Day14_assignment_innerclassandcollection;

class College {

    interface Staff {
        void work();
    }

    class Student {
        int id;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        void study() {
            System.out.println(name + " is studying");
        }
    }

    class Trainer implements Staff {
        String subject;

        Trainer(String subject) {
            this.subject = subject;
        }

        public void work() {
            System.out.println("Trainer is teaching " + subject);
        }
    }

    class SecurityGuy implements Staff {
        String shift;

        SecurityGuy(String shift) {
            this.shift = shift;
        }

        public void work() {
            System.out.println("Security guy working in " + shift + " shift");
        }
    }

    public static void main(String[] args) {

        College c = new College();

        College.Student s = c.new Student(101, "Rahul");
        College.Trainer t = c.new Trainer("Java");
        College.SecurityGuy sg = c.new SecurityGuy("Night");

        s.study();
        t.work();
        sg.work();
    }
}

