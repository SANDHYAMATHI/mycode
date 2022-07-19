package simplilearn1;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i=1;
		int fact_var=1;
		
		Scanner sc= new Scanner(System.in);
System.out.println("Enter the number");
n = sc.nextInt();

//for(i= 1;i<=n;i++){
//	fact_var=fact_var * i;
//}

while(i<=n) {
	fact_var*=i;
i++;
}
System.out.println("The Factorial of "+n +" is:" +fact_var);
}
	}


