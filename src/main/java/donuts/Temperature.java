package donuts;

import java.util.Scanner;

public class Temperature{

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println ("Is the temperature: High, Low or Humid?");
            String userInput = scanner.nextLine();

            String highTemp = "High";
            String midTemp = "Low";
            String humid_Temp = "Humid";

            if (highTemp.equalsIgnoreCase(userInput)) {

                System.out.println("Sunblock may be needed.");

            }

            else if (midTemp.equalsIgnoreCase(userInput)) {
                System.out.println ("A coat may be needed.");

            }

            else{
                System.out.println("It's muddy.");
            }
        }
    }





