package data_structure;
//BUBBLE SORT

import java.util.Scanner;

class sort{
	int[] arr;
	private int n;
	void store() {
	 Scanner input=new Scanner(System.in);

     System.out.println("enter number of elements");

     n = input.nextInt();

     arr=new int[n];

     System.out.println("enter elements");
     for(int i=0;i<n;i++){//for reading array
         arr[i]=input.nextInt();

     }
	}
	void Sort() {
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	void show() {
		for(int i: arr){ //for printing array

            System.out.println(i);

        }

	}
}
public class bubble_sort {
public static void main(String[] args) {
	sort ort=new sort();
	ort.store();
	ort.Sort();
	ort.show();
}
}
