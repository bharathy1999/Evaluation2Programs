package Com.java;
import java.util.Scanner;
public class Pyramidprogram {
    
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter a number:");
		int input=scanner.nextInt();
		int gap=input-1;
		int increment=1;		
		for(int i=1;i<=input;i++) {
	
				for(int k=1;k<=gap;k++){
					System.out.print(" ");
				 }
				int val=1;
				
				for(int l=gap+1;l<=gap+increment;l++) {
					
					if(l<input) {
						System.out.print(val);
						val++;
					}
					else if(l==input) {
						System.out.print(val);
					}
					else {
						--val;
						System.out.print(val);
					}
				 }
			
			gap--;
			increment=increment+2;
			System.out.println();
		}
		

	}

}
