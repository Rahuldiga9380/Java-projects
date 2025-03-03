import java.util.Scanner;

public class Aide{
	public static void main (String [] args) {
		Scanner sc =new Scanner (System.in);
		int myNumber=(int)(Math.random()*100);
		int userNumber=0;
		do {
			System.out.println("guess the number(1-100):");
			userNumber=sc.nextInt();
			if (userNumber==myNumber) {
				System.out.println("WOOHOO.. you won !!! keep it up");
				break;
			}
			else if (userNumber>myNumber) {
				System.out.println("your number is too large try it again");
			}
			else {
				System.out.println("your number is too small try it again");
			}
		}while(userNumber>=0);
		System.out.print("My number was:");
		System.out.println(myNumber);
	}
}

