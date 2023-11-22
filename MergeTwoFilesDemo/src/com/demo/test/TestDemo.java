package com.demo.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Scanner;

public class TestDemo {

	private static void merge(int[] arr1, int[] arr2, int[] arr3) {

		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				arr3[k]=arr1[i];
				i++;
				k++;
			}
			else {
				arr3[k]=arr2[j];
				j++;
				k++;
			}
			
		}
		while(i<arr1.length) {
			arr3[k]=arr1[i];
			j++;
			k++;
		}
		while (j<arr2.length) {
			arr3[k]=arr2[j];
			j++;
			k++;
		}
		
		System.out.println("arr3 : " + Arrays.toString(arr3));
		
	
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int[] arr1 = new int[10];
		int[] arr2 = new int[5];
		int[] arr3 = new int[arr1.length + arr2.length];
		
		int a=0;
		int b=0;
		
		
		try {
			File myobj = new File("file1.txt");
			Scanner myreader = new Scanner(myobj);
			  while(myreader.hasNextLine())
			  {
				  int data = myreader.nextInt();
				  arr1[a] = data;
				  a++;
				  System.out.println(data);
			  }	 System.out.println("arr1 : " + Arrays.toString(arr1));

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		try {
			File myobj = new File("file2.txt");
			Scanner myreader = new Scanner(myobj);
			  while(myreader.hasNextLine())
			  {
				  int data = myreader.nextInt();
				  arr2[b] = data;
				  b++;
				  System.out.println(data);
			  }	 System.out.println("arr2 : " + Arrays.toString(arr2));

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    //merge function	
	 	merge(arr1,arr2,arr3);
		
	 	
	 	//write data in file 3
	 	
	 	try {
			FileWriter fobj = new FileWriter("file3.txt");
			 
			  for(int i=0; i<arr3.length; i++)
			  {
				  fobj.write(arr3[i]);
			  }
			  
			  fobj.close();
			
			  System.out.println("Data write successfully..!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	
	 	
	 	
		try {
			File myobj = new File("file3.txt");
			Scanner myreader = new Scanner(myobj);
			  while(myreader.hasNextLine())
			  {
				  String data = myreader.next();
				  System.out.println(data);
			  }	// System.out.println("file 3 data  : " + Arrays.toString(arr3));

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	
		
		
	}

	
}
