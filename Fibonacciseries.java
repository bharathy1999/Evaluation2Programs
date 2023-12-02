package Com.java;
import java.util.Scanner;
public class Fibonacciseries {
  void display(int input) {
	  int first=0;
		int second=1;
		int temp=0;
		System.out.print(first+" "+second+" ");
		while(second<input) {
			
			temp=first;
			first=second;
			second=temp+second;
			System.out.print(second+" ");
			
		}
  }
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter a number:");
		int input=scanner.nextInt();
		Fibonacciseries fibonacciseries=new Fibonacciseries();
		fibonacciseries.display(input);
	}

}
