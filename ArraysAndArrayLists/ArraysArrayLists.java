/** This program will show working knowledge of arrays, how to manipulate them, 
   2D arrays and arraylists. */
   
import java.util.Scanner;
import java.util.ArrayList;

public class ArraysArrayLists
{
    
    public static void main (String[] args)
    {
        
        int[] numbers = new int[10];
        int i = 0;
        
        Scanner input = new Scanner(System.in);
        
        while (i < numbers.length)
        {
            System.out.print("Please enter a number: ");
            int value = input.nextInt();
            numbers[i] = value;
            i++;
        }
        
        System.out.print("The numbers you entered are ");
        
        for (i = 0; i < numbers.length; i++)
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
        
        int[] numbersTwo = new int[10];
        int j = 9;
        
        for (i = 0; i < numbers.length; i++)
        {
            
            numbersTwo[j] = numbers[i];
            j--;
            
        }
        
        System.out.print("The numbers you entered are ");
        
        for (j = 0; j < numbersTwo.length; j++)
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
        
        int total = 0;
        
        for (int value : numbers)
        {
            
            total = total + value;
            
        }
        
        System.out.println("The following part will give the value and position of the highest value in the numbers array.");
        
        int highestValue = 0;
        int highestArrayPosition = 0;
        
        for (i = 0; i < numbers.length; i++)
        {
            
            if (numbers[i] > highestValue)
            {
                
                highestValue = numbers[i];
                highestArrayPosition = i;
                
            }
            
        }
        
        System.out.println("The highest value in the numbers array is " + highestValue + " and the position of that value in the array is numbers[" + highestArrayPosition + "].");
    
        System.out.println("The following part of the program will send the inputs stored in the numbers array to a method which will add each individual number with the following number and then return the array.");
        System.out.println("For example, if the array contains 1, 2, 3, 4, 5, then 3, 5, 7, 9 will be returned.");
        
        int[] methodArray = new int[numbers.length - 1];
        methodArray = addNumbers(numbers);
        
        for (i = 0; i < methodArray.length; i++)
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
        int width2dArray = input.nextInt();
        System.out.println("Please enter a number for the height of the 2D array");
        int height2dArray = input.nextInt();
        System.out.println("The array will now be populated by random 1s an 0s.");
        int[][] new2dArray = new int[width2dArray][height2dArray];
        
        for(i = 0; i < new2dArray[0].length; i++)
        {
            
            for(j = 0; j < new2dArray.length; j++)
            {
                
                double randomNumber = Math.random();
                int roundNumber = (int) Math.round(randomNumber);
                new2dArray[i][j] = roundNumber;
                System.out.print(new2dArray[i][j]);
                
            }
            System.out.println();
        }
        
        System.out.println("The last part of this program will deal with Arraylists.");
        System.out.println("The user will be asked for several names to be input.");
        System.out.println("These names will be saved in an Arraylist and then retrieved using various commands.");
        ArrayList <String> names = new ArrayList<String>();
        
        String addedName = "";
        int namePosition;
        
        while (!"q".equals(addedName))
        {
            
            System.out.println("Please enter a name (Enter q to quit/end): ");
            addedName = input.next();
            
            if (!"q".equals(addedName))
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
        
        for (int i = 0; i < array.length; i++)
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
