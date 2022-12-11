import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    //Create a constructor that takes in employee's first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED" + this.firstName + this.lastName);

        // call a method that asks for the department and returns it
        this.department = setDepartment();
        System.out.println("Department Selected: " + this.department);
    }
    //Ask for the department
    private String setDepartment() {
        System.out.println("Enter the number associated to your department: \n 1 for Engineering \n 2 for Sales \n 3 for Accounting");
        Scanner scan = new Scanner(System.in);
        int depChoice = scan.nextInt();
        if (depChoice == 1) {
            return "Engineering";
        }
        else if (depChoice == 2) {
            return "Sales";
        }
        else if (depChoice == 3) {
            return "Accounting";
        }
        else {
            return "Your response was invalid.";
        }
    }


    //Generate a random password

    //Set alternate email


    //Change password

}
