package Lesson5;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args){
        int[] arr = {55,86,23,75,99,1,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search");
        int searchValue = sc.nextInt();
            int result = (int) linearing(arr,searchValue);

            if(result==-1){

                System.out.println("Element not present");
            } else 
            {
                System.out.println("Element "+arr[result]+" found at index: "+result);
            } }
public static int linearing(int arr[], int x)
{
    int arrlength = arr.length;
    for (int i = 0; i < arrlength - 1; i++) {
        if (arr[i] == x) {
            return i;

         }
     }
            return -1;
   }

}
