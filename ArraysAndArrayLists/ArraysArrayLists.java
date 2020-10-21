/** This program will show working knowledge of arrays, how to manipulate them, 
   2D arrays and arraylists. */
   
import java.util.Scanner;
import java.util.ArrayList;

public class ArraysArrayLists
{
    
    public static void main (String[] args)
    {
        
        int[] numbers = new int[10]; // Declare new array of length 10
        int i = 0; // A variable that will be used throughout the program for the purpose of counting
        
        Scanner input = new Scanner(System.in); // New Scanner to read user input
        
        while (i < numbers.length) // Checks if i is less than the length of the numbers array
        {
            System.out.print("Please enter a number: "); 
            int value = input.nextInt(); // Stores value in this variable
            numbers[i] = value; // Adds value in value variable to array at position i
            i++;
        }
        
        System.out.print("The numbers you entered are ");
        
        for (i = 0; i < numbers.length; i++) // This for loop traverses the array and prints out values stored at position i
        {
            
            if (i == 8)
            {
                System.out.print(numbers[i] + " ");
            }
            else if (i == 9)
            {
                System.out.print("and " + numbers[i]);
            }
            else 
            {
                System.out.print(numbers[i] + ", ");
            }
            
        }
        
        System.out.println();
        System.out.println("The numbers that were entered will now be reversed.");
        System.out.println("This will involve using a second array and the numbers will be printed from that array.");
        
        int[] numbersTwo = new int[10]; // Declares new array named numbersTwo
        int j = 9; // Declares variable j and starts at 9 because it will be used to start at the end of array numbersTwo
        
        for (i = 0; i < numbers.length; i++) // This for loop traverses the numbers array
        {
            
            numbersTwo[j] = numbers[i]; // Duplicated value at position i to position j in numbersTwo array to reverse the array
            j--;
            
        }
        
        System.out.print("The numbers you entered are ");
        
        for (j = 0; j < numbersTwo.length; j++) // This for loop traverses array numbersTwo and prints out each value
        {
            
            if (j == 8)
            {
                System.out.print(numbersTwo[j] + " ");
            }
            else if (j == 9)
            {
                System.out.print("and " + numbersTwo[j]);
            }
            else
            {
                System.out.print(numbersTwo[j] + ", ");
            }
        }
        
        System.out.println();
        System.out.println("The following part will use an enhanced for loop to total the elements in the original array.");
        
        int total = 0; // Keeps count of total
        
        for (int value : numbers) // This enhanced for loop takes each value in numbers and adds it to total
        {
            
            total = total + value;
            
        }
        
        System.out.println("The following part will give the value and position of the highest value in the numbers array.");
        
        int highestValue = 0; // Variable to store highest value in array
        int highestArrayPosition = 0; // Value to keep track of where the highest value is positioned in the array
        
        for (i = 0; i < numbers.length; i++) // This for loop traverses the numbers array and looks for the highest value and its position in the array
        {
            
            if (numbers[i] > highestValue) // If condition checks if value at position i is greater than the current highest value
            {
                
                highestValue = numbers[i];
                highestArrayPosition = i;
                
            }
            
        }
        
        System.out.println("The highest value in the numbers array is " + highestValue + " and the position of that value in the array is numbers[" + highestArrayPosition + "].");
    
        System.out.println("The following part of the program will send the inputs stored in the numbers array to a method which will add each individual number with the following number and then return the array.");
        System.out.println("For example, if the array contains 1, 2, 3, 4, 5, then 3, 5, 7, 9 will be returned.");
        
        int[] methodArray = new int[numbers.length - 1]; // New array is declared to use with a method
        methodArray = addNumbers(numbers); // Sends numbers as an argument to the method addNumbers and stores the result in methodArray
        
        for (i = 0; i < methodArray.length; i++) // This for loop traverses methodArray and prints out each value
        {
            
            if (i == methodArray.length - 2)
            {
                System.out.print(methodArray[i] + " ");
            }
            else if (i == methodArray.length - 1)
            {
                System.out.print("and " + methodArray[i]);
            }
            else 
            {
                System.out.print(methodArray[i] + ", ");
            }
            
        }
        
        System.out.println();
        
        System.out.println("The next part will deal with 2D Arrays.");
        System.out.println("Please enter a number for the width of the 2D array");
        int width2dArray = input.nextInt(); // Stores width of 2D array input by user
        System.out.println("Please enter a number for the height of the 2D array");
        int height2dArray = input.nextInt(); // Stores height of 2D array input by user
        System.out.println("The array will now be populated by random 1s an 0s.");
        int[][] new2dArray = new int[width2dArray][height2dArray]; // Creates new 2D array of specified height and width
        
        for(i = 0; i < new2dArray[0].length; i++) // Goes through each column of 2D array
        {
            
            for(j = 0; j < new2dArray.length; j++) // Goes through each row of 2D array
            {
                
                double randomNumber = Math.random(); // Generates random number
                int roundNumber = (int) Math.round(randomNumber); // Rounds random number up or down to get either 0 or 1
                new2dArray[i][j] = roundNumber; // Stores rounded random number in current position of 2D array
                System.out.print(new2dArray[i][j]); // Prints out current rounded random number at current position of 2D array
                
            }
            System.out.println(); // Moves onto next row once all entries have been printed for row.
        }
        
        System.out.println("The last part of this program will deal with Arraylists.");
        System.out.println("The user will be asked for several names to be input.");
        System.out.println("These names will be saved in an Arraylist and then retrieved using various commands.");
        ArrayList <String> names = new ArrayList<String>(); // Creates new arraylist named names
        
        String addedName = ""; // This String will store strings input by user
        int namePosition; // namePosition will be used to store arraylist position input by user
        
        while (!"q".equals(addedName)) // Use a while loop to ask the user to repeatedly type names with q being entered to quit
        {
            
            System.out.println("Please enter a name (Enter q to quit/end): ");
            addedName = input.next(); // Stores input in addedName
            
            if (!"q".equals(addedName)) // Checks if addedName is equal to q otherwise adds entry to arraylist
            {
                names.add(addedName);
            }
            
        }
        
        System.out.println("The values entered into the ArrayList are: ");
        System.out.println(names);
        System.out.println("Please enter a number for the position of the ArrayList where you would like to retrieve the current value.");
        namePosition = input.nextInt();
        System.out.println(names.get(namePosition));
        System.out.println("Please enter a position for which you would like to overwrite the existing value.");
        namePosition = input.nextInt();
        System.out.println("Please enter the new name: ");
        addedName = input.next();
        names.set(namePosition, addedName);
        System.out.println("The current ArrayList now contains: ");
        System.out.println(names);
        
    }
    
    public static int[] addNumbers(int[] array)
    {
        /** Purpose of this method is to add value at current position of array with value at i+1 */
        
        for (int i = 0; i < array.length; i++) // Traverses array and adds value at current position with value at i+1
        {
            if (i < (array.length - 1))
            {
            
                array[i] = array[i] + array[i + 1];
                
            }
            else
            {
                break;
            }
        
        }
        
        return array;
        
    }
}
