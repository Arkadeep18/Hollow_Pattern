import java.util.*;
public class Prac16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter x(row)");
		int x = sc.nextInt();
		System.out.println("Enter y(column)");
		int y = sc.nextInt();
		 
		 
		for (int a=1; a<=x; a++) {
			for (int b=1; b<=y; b++) {
				if(a == 1 || b == 1 || a == x || b == y) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
