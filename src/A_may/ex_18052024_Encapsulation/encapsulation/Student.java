package A_may.ex_18052024_Encapsulation.encapsulation;

public class Student {
    private String Name;

    Student(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        if (name != null) {
            if (name != "") {
                this.Name = name;
            } else {
                System.out.println("You have entered Empty in the input");
            }
        } else {
            System.out.println("You have entered null in the input");
        }
    }

    void StudentDetails() {
        System.out.println("Student name-> " + getName());
    }
}

class runnerr {
    public static void main(String[] args) {
        Student s = new Student("Praveen");

        s.StudentDetails();//get

        s.setName("");//set
        s.StudentDetails();
    }
}
