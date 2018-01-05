package kitchen;

import java.util.Scanner;

/**
 *
 * @author makena
 */
public class Kitchen {

    /**
     * @param args the command line arguments
     */
    public Scanner sc = new Scanner(System.in);
    String input;
    
    public static void main(String[] args) {
        // TODO code application logic here

        // Start the kitchen  process
    Kitchen starter = new Kitchen();
    starter.startKitchen();
    }

    void startKitchen() {

        System.out.println("Welcome to your kitchen. What would you like to do? ");
        System.out.println("1.) Cook \n 2.) Check Ingredients \n 3.) Quit");
        
        input = sc.nextLine();
        
        
        switch(input){
            case "1":
                System.err.println("1");
                
                break;
            case "2":
                
                break;
            case "3":
                
                break;
                
            default:
                System.out.println("Invalid Choice!");
                startKitchen();
                
                break;
        }

    }

}
