package lesson2;
import java.util.Scanner;
public class emailArray {
	
    public static void main(String[] args) 
    { 
      String[] strArray = new String[6];
      strArray[0]= "sandhya@gmail.com";
      strArray[1]= "swathi@gmail.com"; 
      strArray[2]= "vishnu@gmail.com"; 
      strArray[3]= "vaasu123@gmail.com"; 
      strArray[4]= "penquin345@gmail.com";
      strArray[5]= "prasath583@gmail.com"; 
      
        boolean found = false;
        int index = 0;
        
        Scanner Str =new Scanner(System.in);
        System.out.println("Enter the Email ID:");
        String a= Str.nextLine(); 
       for (int i = 0; i <strArray.length; i++) {
       if(a.equals(strArray[i])) {
            index = i; found = true; 
            }
        }
       if(found) 
          System.out.println("\n" +a +" found at the index "+index);
        else
          System.out.println("\n" +a+"Email doesn't found");
    }
}

