package Com.java;
import java.util.Scanner;
public class ArmStrongNumber {
   
	 void armstrongverify( int userinput){
		 int k=userinput;
	        int sum=0;
	        while(userinput!=0) {
	        	int rem=userinput%10;
	        	sum=sum+(rem*rem*rem);
	        	userinput=userinput/10;
	        }
	        if(sum==k) {
	        	System.out.println(k+" is a armstrong number.");
	        }
	        else {
	        	System.out.println(k+" is not a armstrong number.");
	        }
	  }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number:");
        int userinput=scanner.nextInt();
        ArmStrongNumber armstrongnumber = new ArmStrongNumber();
        armstrongnumber.armstrongverify(userinput);
	}

}
