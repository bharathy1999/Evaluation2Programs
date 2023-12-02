package Com.java;

import java.util.ArrayList;

public class Pairsnumber {
     void displaynumbers(int arr[],int k) {
    	 ArrayList <ArrayList<Integer>>  arrayList=new ArrayList ();
 		ArrayList arraylist;
 		for(int i=0;i<arr.length;i++) {
 			for(int j=i+1;j<arr.length;j++) {
 				 arraylist=new ArrayList();
 				if( (arr[i]+arr[j])%k==0 ) {
 					arraylist.add(arr[i]);
 					arraylist.add(arr[j]);
 				}
 				if(!arraylist.isEmpty()) {
 				arrayList.add(arraylist);
 				}
 			}
 		}
 System.out.println(arrayList);
 		
     }
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int k=5;
		Pairsnumber pairsnumbers=new Pairsnumber();
		pairsnumbers.displaynumbers(arr, k);
		
		
	}

}
