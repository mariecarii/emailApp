import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultPasswordLength = 8;
    private int mailboxCapacity = 400;
    private String alternateEmail;
    private String companySuffix = "company.com";

    //Create a constructor that takes in employee's first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // call a method that asks for the department and returns it
        this.department = setDepartment();
        System.out.println("Department Selected: " + this.department);

        // call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);

        // combine elements to create email (firstName.lastName@department.company.com)
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
    }
    //Ask for the department
    private String setDepartment() {
        System.out.println("New employee: " + firstName + ". " + "Enter the number associated to your department: \n 1 for Engineering \n 2 for Sales \n 3 for Accounting");
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
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@!#$%";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String (password);
    }
    //set mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //Set alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    //Change password
    public void changePassword(String password) {
        this.password = password;
    }

    //show mailbox capacity
    public int getMailboxCapacity() {return mailboxCapacity;}

    //alternate email
    public String getAlternateEmail() {return alternateEmail;}

    //password
    public String getPassword() {return password;}

    //method to show all the information
    public String showInfo() {
        return "NAME: " + firstName + " " + lastName + "\nCOMPANY EMAIL: " + email + "\nPASSWORD: " + password +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + " gb";
    }
}
