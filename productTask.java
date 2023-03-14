package firstpackage;
import java.util.Scanner;
import java.util.Random;
public class product {
	public static void main(String[] args) {
		System.out.println("Enter the total number of products:");
		Scanner sc=new Scanner(System.in);
		int nprod= sc.nextInt();
		boolean index[]= new boolean[nprod];
		String[] pName= new String[nprod];
		int[] uPrice= new int[nprod];
		int[] qnt= new int[nprod];
		int[] stock= new int[nprod];
		int[] pid= new int[nprod];
		
		for(int i=0;i<nprod;i++) {
			pid[i]=new Random().nextInt();
			System.out.print("Enter the product name: ");
			pName[i]= sc.next();
			System.out.println("Enter the unit price of product: ");
			uPrice[i]=sc.nextInt();
			System.out.println("Enter the quantity of product: ");
			qnt[i]=sc.nextInt();
			System.out.println("Enter the total available stock of the product: ");
			stock[i]=sc.nextInt();
			
		}
		for(int i=0;i<index.length;i++) {
			if(qnt[i]>stock[i]) {
				System.out.println("The product " +pName[i]+  " is out of stock");
			}
			else {
				System.out.println("Total Cost: " +uPrice[i]*qnt[i]);
				System.out.println("Remaining stock of product" +pName[i]+ "is : " +(stock[i]-qnt[i]));
			}
		}
		sc.close();
	}

}