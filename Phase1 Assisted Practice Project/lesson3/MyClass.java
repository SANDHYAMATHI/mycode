package lesson3;

public class MyClass 
{
    public static void main(String args[]) 
    {
        int[] array = new int[5];
        try 
        {
            array[9] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds!"); 
        }
        finally 
        {
            System.out.println("The array is of size " + array.length);
        }
    }
}
