import java.util.Scanner;
public class OneDimensionalArray 
{
    
    public static void main(String args[])
    {
       Scanner scan = new Scanner(System.in);
       int temp, size;
       int array[] = new int[10];
       
       size = array.length;
     
       System.out.println("enter the size of array:-");
       size = scan.nextInt();
       System.out.println("enter your number");
       size = scan.nextInt();
        for(int i = 0; i<size; i++ )
        {
                for(int j = i+1; j<size; j++)
                {
            
                if(array[i]>array[j])
                {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
                System.out.println("Third second largest number is:: "+array[size-2]);
    }
}
