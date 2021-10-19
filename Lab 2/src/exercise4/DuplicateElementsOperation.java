
//This pgm is not completed yet.
package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElementsOperation {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		
		//to take size of the array from user
		System.out.println("Enter the size of an array: ");
		int length= scn.nextInt();
		
		int[] arr= new int[length];
		System.out.println("Enter "+length+" elements in array: ");
		
		for(int i=0; i<length; i++)  
		{  
			//reading array elements from the user 
			arr[i]=scn.nextInt();  
		}
		System.out.println("Original Array is: ");
		for(int orArr:arr)
			System.out.print(orArr+" ");
		
		System.out.println();
		
		modifyArray(arr);
		for(int modArr: arr)
			System.out.print(modArr+" ");

	}
	
	static int[] modifyArray(int[] arr) {
		
		
		//logic for identify duplicate elements in array
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length;j++) {
				if(arr[i]==arr[j])
					arr[j]=0;
			}
		}
		
		System.out.println("After removing duplicate elements: ");
		int[] remArr= new int[arr.length];
		for(int y=0; y<arr.length;y++) {
			if(arr[y]!=0)
				remArr=arr;
		}
		
		for(int finalArr: remArr)
			System.out.print(finalArr+" ");
		System.out.println();
		
		//sort the reversed array
		System.out.println("Sorted Array after removing duplicate elements is: ");
		Arrays.sort(arr);
		int[] sortArr=new int [arr.length];
		for(int x=0; x<=arr.length;x++) {
			sortArr=arr;
		}
		return sortArr;
		
//		//logic for remove duplicate elements from the array
//		System.out.println("After removing duplicate elements: ");
//		int[] remArr= new int [arr.length];
//		for(int i=0; i<arr.length;i++) {
//			if(arr[i]!=0) {
//				remArr= arr;
//			}
//		}
//		return remArr;
	}

}
