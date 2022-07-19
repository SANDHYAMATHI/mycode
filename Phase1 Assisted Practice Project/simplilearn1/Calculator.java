package simplilearn1;
import java.util.*;
public class Calculator{
     public static void main(String[] args){
         float a,b,result=0;
         int choice;
        
         Scanner num = new Scanner(System.in); 
         System.out.print("Enter first number: ");
         a=num.nextFloat();
         System.out.print("Enter second number: ");
         b=num.nextFloat();
          
         System.out.print("\n1: Addition.\n2: Subtraction.\n3: Multiplication.\n4: Divide.\n5: Exit.");
          
         System.out.print("\nEnter your choice: ");
         choice=num.nextInt();
          
         switch(choice)
         {
             case 1:
                 result=(a+b); 
                 break;
             case 2:
                 result=(a-b); 
                 break;
             case 3:
                 result=(a*b); 
                 break;
             case 4:
                 result=a/b; 
                 break;
             default:
                 System.out.println("Exit from Calculator!!!\n");
         }
         if(choice>=1 && choice<=4)
            System.out.println("Result is: " + (double) result);
     }
}
