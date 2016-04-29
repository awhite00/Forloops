import java.util.Scanner;
public class Floop5 
{

	public static void main(String[] args) 
	{
		Scanner userInput=new Scanner (System.in);
		System.out.println("Please give me a lowerbound number!");
		int sum=0;
				int lowerbound=userInput.nextInt();
				System.out.println("Please give me an uperbound number!");
				int upperbound=userInput.nextInt();
				for(int i=lowerbound;i<=upperbound;i++)
				{
					System.out.println(i);
					sum=sum+i;
					
				}
		
				System.out.println(sum);
	}

}
