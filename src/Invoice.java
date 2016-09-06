import java.util.Scanner;


public class Invoice 
{

	public static void main(String[] args)
	{
		//declare the array of a set size
		 double myPrices[] = new double[100];
		 Scanner sc = new Scanner(System.in);
		 System.out.print("tax Rate ? \t:");
		 double t = sc.nextDouble();
		 double sum =0;
		//add prices to array. 
		//Use a counter to keep track of how many items are in your array.
		 int counter =0;
		 for (int i=0; i<100; i++)
		 {
			 System.out.print("Enter Price "+ (i+1) + "\t:");
			 double p = sc.nextDouble();
			 if (p==0)
			 {
				 break;
			 }	
			 else
			 {
				 sum = sum +p;
				 myPrices[i] = p;
				 counter++;
			 }
				 
			 
		 }
		//print the array
		 System.out.println("Receipt");
		 for (int i=0;i <counter; i++){
		 //System.out.printf("The price is %.02d \t:\n",myPrices[i]);
		 }
		// System.out.printf("%02d\tSubtotal\n",sum);
		 System.out.println(sum*t);
		 double tot = sum + (sum*t);
		 
		 //System.out.printf("%02d\tSubtotal\n",tot);
		 System.out.println(tot);
		// TODO Auto-generated method stub
	}
}

