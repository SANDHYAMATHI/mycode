package lesson2;

public class method1 {

	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {

		method1 b= new method1();
		int ans= b.multipynumbers(10,3);
		System.out.println("Multipilcation is :"+ans);
		}
	}
