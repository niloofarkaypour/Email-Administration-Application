package emailApp;

import java.util.Scanner;

public class EmailApp {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name and last name please");
        Email em1 = new Email(input.next(), input.next());
        System.out.println("your random generated password is -> "+em1.getPassword());
        System.out.println("please change your password now\nenter new password");
        em1.setPassword(input.next());
        System.out.println("new password is set to -> "+ em1.getPassword());
        System.out.println("\n***** UPDATED INFORMATION *****\n" + em1 );

    }
}
