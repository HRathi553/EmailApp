public class EmailApp {

//  Application is able to do the following:

//  1. Generate an email with the following syntax: firstName.lastName@department.company.com
//  2. Determine the department (sales,development,accounting), if none leave blank.
//  3. Generate a random String for a password.
//  4. Have set methods to change the password, set the mailbox capacity, and define an alternate email address.
//  5. Have get methods to display the name, email, and mailbox capacity.

    public static void main(String args[]){

        Email em1 = new Email("Harsh","Rathi");

    //    em1.changePassword("Harsh553@");

        System.out.println(em1.showInfo());
    }
}
