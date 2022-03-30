package donuts;

import java.util.Scanner;

public class Password {
    public static void main (String [] args) {
        {
            final String PASSWORD = "Wednesday";
            Scanner sc = new Scanner(System.in); // creates the scanner
            int attempts = 3; // number of attempts
            String password = "Homework";
            while (attempts-- > 0 && !PASSWORD.equals(password))
            {
                System.out.print("Enter your password: ");
                password = sc.nextLine();
                if (password.equals(PASSWORD))
                    System.out.println("You're logged in");
                else
                    System.out.println("Incorrect. Number of attempts remaining: " + attempts);
            }
        }
    } }

