import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    private String companySuffix = "aeycompany.com";

    //  Constructor to receive the first name and last name
    public Email(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Email Created: " + this.firstName + " " + this.lastName);

    //  Call a method asking for the department
        this.department = setDepartment();
        System.out.println("Department is: " + this.department);

    //  Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your Password is: " + this.password);

    //  Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is: " + email);
    }

    //  Ask for the department
    private String setDepartment(){
        System.out.println("\n Enter the department code \n 1. for Sales \n 2. for Development \n 3. for Accounting \n 0. for none");

        Scanner reader = new Scanner(System.in);
        int deptChoice = reader.nextInt();

        switch (deptChoice){

            case 1: return "sales";
            case 2: return "dev";
            case 3: return "acct";
            default: return " ";
        }
    }

    //  Generate a random password
    private String randomPassword(int length){

        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ012345789!@#$%";
        char[] password = new char[length];

        for (int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //  Set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    //  Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    //  Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
               "\n COMPANY EMAIL: " + email +
               "\n MAILBOX CAPACITY: " + mailBoxCapacity + "mb";
    }
}
