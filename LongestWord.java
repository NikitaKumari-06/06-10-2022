/*
 * 2.	Write a Java program to find the longest word in a text file.
 */
package com.file.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {
		try {
		new LongestWord().findLongestWord();  //give longestword from the given file
		}
		catch(FileNotFoundException ex) {
			System.out.println("Exception caught!");
			System.out.println(ex.getMessage());
		}
	}

	//method to find the longest word of the file
	public String findLongestWord() throws FileNotFoundException {
		 String longestWord = "";      //initial value of longestword
	       String current;
	       Scanner sc = new Scanner(new File("C:\\test.txt"));


	       while (sc.hasNext()) {
	          current = sc.next();  //assign value from txt file
	           if (current.length() > longestWord.length()) {  //compare the lenghth of longest word and current word.
	             longestWord = current;    //assign current value in longestword
	           }

	       }
	         System.out.println("\n"+longestWord+"\n");
	            return longestWord;
	            }
	

}
