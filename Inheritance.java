import java.util.ArrayList;

/**
 * Inheritance
 */
public class Inheritance {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(3.0);
        account.withdraw(10);
        System.out.println(account.getBalance());
        SavingsAccount savingsAcct = new SavingsAccount(2.1);
        savingsAcct.deposit(500);
        savingsAcct.withdraw(10);
        System.out.println(savingsAcct.getBalance());


        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Paul"));
        students.add(new Student("Peter"));
        students.add(new Student("Parker"));

        students.sort(new StudentComparator());

        for (Student student : students) {
            System.out.println(student.GetName());
        }


    }
    

}