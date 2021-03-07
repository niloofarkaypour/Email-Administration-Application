package emailApp;

import java.util.Random;
import java.util.Scanner;

public class Email {

    private final String firstName;
    private final String lastName;
    private final String department;
    private String password;
    private int defaultPasswordLength = 8;
    private int mailBoxCapacity = 500;
    private String AlternateEmail;


    //constructor to receive first name & last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //call a method to ask for the department - return department
        this.department = setDepartment();
        //call me method that return a random password
        this.password = setRandomPassword(defaultPasswordLength);
        //call a method to return the created email
        System.out.println("your email is created\n"+emailFormat());

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return AlternateEmail;
    }

    public String getPassword() {
        return password;
    }

    //ask for department
    private String setDepartment(){

        System.out.println("what is the department?\n1 for Sales \n2 for Development \n3 for Accountant \n0 for None");
        Scanner input = new Scanner(System.in);
        int depChoice = input.nextInt();
        if (depChoice == 1)
            return "sale";
        else if (depChoice == 2)
            return "dev";
        else if (depChoice == 3)
            return "acc";
        else
            return "";
    }

    //generate a random password
    private String setRandomPassword(int length){

        char[] randomPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*(){}[];".toCharArray();
        StringBuilder password = new StringBuilder();
        for (int i=0;i<length;i++){
            int randomIndex = (int)(Math.random() * randomPassword.length);
            password.append(randomPassword[randomIndex]);
        }
        return password.toString();
    }

    //set mail box capacity
    public void setMailBoxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }

    //set alternate email address
    public void setAlternateEmail(String alternateEmail) {
        AlternateEmail = alternateEmail;
    }

    // change the password
    public void setPassword(String password) {
        this.password = password;
    }

    //display name, email, mailbox capacity
    @Override
    public String toString() {
        return "\nname= " + firstName + " " + lastName +"\ndepartment= " + department + "\nemail= " + emailFormat() +"\npassword= " + password + "\nmailbox capacity= "+ mailBoxCapacity;
    }

    public String emailFormat() {
        String email;
        if (department.equals("")){
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + "company" + ".com";
        }
        else{
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + "company" + ".com";
        }
        return email;

    }
}
