public class Student extends User {
    float gpa;

    public Student(String name) {
        super(name);
        System.out.println("Called the Student Constructor");
    }

    @Override
    public String GetName() {
        // TODO Auto-generated method stub
        return super.GetName() + " is a Student";
    }
}
