import java.util.Scanner;

public class Nuclear {
    public static void main(String[] args) {

        Scanner nuclearObj = new Scanner(System.in);
        System.out.println("What is the total number of employees?");
        int numEmployees = nuclearObj.nextInt();

        Scanner nuclearObj1 = new Scanner(System.in);
        System.out.println("What is the name of supervisor?");
        String name = nuclearObj1.nextLine();

        System.out.println("How many times the Nuclear waste is removed from the core?");
        int numRemoved = nuclearObj.nextInt();

        System.out.println("What is the total weight of the waste produced every 1 week?");
        float wasteWeight = nuclearObj.nextFloat();

        System.out.println("Is Electric Motor being replaced every 18 days? Press y for yes and n for no:");
        char yn = nuclearObj.next().charAt(0);
        
        System.out.println("What is the core average temperature (celsius) of the Nuclear Reactor? ");
        float avgTemp = nuclearObj.nextFloat();

        System.out.println("Total number of employees: " + numEmployees);
        System.out.println("Name of supervisor is: " + name);
        System.out.println("Times the Nuclear waste removed from the core: " + numRemoved + " times");
        System.out.println("Total weight of the waste produced every 1 week: " + wasteWeight + " kgs");

        if (yn == 'y' || yn == 'Y') {
            System.out.println("Yes, the electric Motor is being replaced every 18 days.");
        } else {
            System.out.println("No, the electric Motor isn't replaced every 18 days.");
        }

        System.out.println("Core Average Temperature: " + avgTemp + "°C " + "," + (avgTemp+273.15) + "°F");
    }
}

