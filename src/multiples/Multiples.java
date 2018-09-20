/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiples;

/*
Braden Niksich
This application displays multiples of 2. The user gets to input how many multiples they would like to see.
 */

//Importing java Scanner.
import java.util.Scanner;

public class Multiples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creating scanner object to read user inputs.
        Scanner input = new Scanner(System.in);
        
        //Setting variables and initializing them with values.
        int multiple = 1;
        int multipleCounter = 0;
        
        //Prompt to enter how many multiples of two the user wants to display.
        System.out.println("Welcome! This program displays multiples of 2!");
        System.out.print("Please input how many multiples you would like displayed: ");
        
        //Reading the number of multiples the user wants to see.
        int userInput = input.nextInt();
        
        //While loop. Begins since multipleCounter initial value is 0.
        while (multipleCounter < userInput)
        {
            //Creating a variable to store the mulitples.
            int display = 2 * multiple; //Equation for the multiples.
            
            /*
            Another equation to store the multiple variable with the correct integer.
            Since inital value of multiple 1, the new value is 2. 
            This continues and allows for the above equation to store the correct multiple.
            */
            multiple = multiple + multiple;
            
            //Counter to keep track of how many loops are being performed.
            multipleCounter = multipleCounter + 1;
            
            //Displaying the multiples of two.
            System.out.printf("%d%n", display);      
        }
        //Prompt thanking the user for using the program!
        System.out.println("Thanks for using the application!");    
    }
    
}
