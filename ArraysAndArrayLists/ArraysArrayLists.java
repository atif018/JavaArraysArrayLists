/** This program will show working knowledge of arrays, how to manipulate them, 
   2D arrays and arraylists. */
   
import java.util.Scanner;

public class ArraysArrayLists
{
    
    public static void main (String[] args)
    {
        
        int[] numbers = new int[10];
        int i = 0;
        
        Scanner input = new Scanner(System.in);
        
        while (i < 10)
        {
            System.out.print("Please enter a number: ");
            int value = input.nextInt();
            numbers[i] = value;
            i++;
        }
        
        System.out.print("The numbers you entered are ");
        
        for (i = 0; i < 10; i++)
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
        
        for (i = 0; i < 10; i++)
        {
            
            numbersTwo[j] = numbers[i];
            j--;
            
        }
        
        System.out.print("The numbers you entered are ");
        
        for (j = 0; j < 10; j++)
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
    }
}
