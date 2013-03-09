package com.HackerRank.InsertSort;

/* Head ends here */
import java.util.*;
public class Solution {
       
	static void insertionSort(int[] ar) {
		int lastElem = ar[ar.length - 1];
		for (int i = ar.length-1; i >=0; i--) 
        {
			if(i == 0){
				ar[i] = lastElem;
				break;
			}
			if (lastElem < ar[i - 1]) {
				ar[i] = ar[i - 1];
			} else {
				ar[i] = lastElem;
				break;
			}
			printArray(ar);
		}
		printArray(ar);
	}   

	static void insertionSort2(int[] ar) {
		for (int i = 1; i < ar.length; i++) {
			int temp = ar[i];
			int j = i;
			while ((j > 0) && (ar[j - 1] > temp)) {
				ar[j] = ar[j - 1];
				--j;
			}
			ar[j] = temp;
			printArray(ar);
		}

	}

/* Tail starts here */
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           insertionSort(ar);
       }    
   }