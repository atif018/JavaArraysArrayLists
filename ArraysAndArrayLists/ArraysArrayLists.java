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
            System.out.println("Please enter a number: ");
            int value = input.nextInt();
            numbers[i] = value;
            i++;
        }
        
        System.out.print("The numbers you entered are ");
        
        for (i = 0; i < 10; i++)
        {
            System.out.print(numbers[i] + " ");
        }

    }
}
