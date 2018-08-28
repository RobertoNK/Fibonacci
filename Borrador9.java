import java.util.Scanner;

public class Borrador9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a limit: ");
		int userNumber=input.nextInt();
		int previous=1,current=1,next;
		next=previous+current;
		System.out.print(previous+" ");
		while(current<=userNumber) {
			System.out.print(current+" ");
			previous=current;
			current=next;
			next=previous+current;
			
		}

	}

}
