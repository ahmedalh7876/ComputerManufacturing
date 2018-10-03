/*
 * Author: Ahmed A.
 * Last edit: 2nd of October, 2018
 * The program calculates the volume of water used to manufacture the computer components of the user.
 */

package computermanufacturing;

//Import keypress scanner to detect keystrokes within console, and decimal format storage variable
import java.util.Scanner;

public class ComputerManufacturing {

    public static void main(String[] args) {
        
        //Keypress scanner within console window
        Scanner keyPress = new Scanner(System.in);
        
        //Variable declaration and initialization area
        final double WATER_RQURMNT = 1.5;
        int combo = 0;
        double total;
        
        System.out.println("Enter the number of computer/monitor combos you own: ");
        combo = keyPress.nextInt();
        total = combo * WATER_RQURMNT;
        
        System.out.println("\nYou own: " + combo + " computer/monitor combos.");
        System.out.println("It took: " + total + " tons of water to manufacture your products.");
    }
    
}
