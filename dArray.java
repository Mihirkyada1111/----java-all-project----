import java.util.Scanner;
public class dArray 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];

       
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) 
         {
            arr[i] = scan.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) 
        {
            if (arr[i] > largest) 
            {
                secondLargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] > secondLargest && arr[i] != largest) 
            {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) 
        {
            System.out.println("No second largest number found.");
        } else 
        {
            System.out.println("The second largest number is: " + secondLargest);
        }

        scan.close();
    }
}