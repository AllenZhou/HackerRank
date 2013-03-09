package com.HackerRank.InsertSort;
import junit.framework.TestCase;
import org.junit.Test;


public class TestInsertSort extends TestCase {

	@Test
	public void test() {
		int[] inPutData = {2,4,6,8,5};
		Solution.insertionSort(inPutData);
		int[] except={2,4,5,6,8};
		for(int i=0; i<(inPutData.length)-1; i++){
			assertEquals(except[i],inPutData[i]);
		}

	}
  
	@Test
	public void test1(){
		int[] inPutData = {2,4,6,8,3};
		Solution.insertionSort(inPutData);
		int[] except={2,3,4,6,8};
		for(int i=0; i<(inPutData.length)-1; i++){
			assertEquals(inPutData[i],except[i]);
		}
	}

	@Test
	public void test2(){
		int[] inPutData = {2,4,6,8,1};
		Solution.insertionSort(inPutData);
		int[] except={1,2,4,6,8};
		for(int i=0; i<(inPutData.length)-1; i++){
			assertEquals(inPutData[i],except[i]);
		}
	}
}
