/*
 * 1.	Write a Java program to store text file content line by line into an array.
 */
package com.file.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextToArray {
	  public static void main(String a[]){
	        StringBuilder sb = new StringBuilder();
	        String strLine = "";
	        List<String> list = new ArrayList<String>();
	        try {
	             BufferedReader br = new BufferedReader(new FileReader("C:\\word.txt"));
	              while (strLine != null)
	               {
	                strLine = br.readLine();   // read the line
	                sb.append(strLine);        // connect the line
	                sb.append(System.lineSeparator()); // returns the same value in separate line
	                strLine = br.readLine();
	                if (strLine==null)
	                   break;
	                list.add(strLine);
	            }
	         System.out.println(Arrays.toString(list.toArray()));   //convert array into list
	             br.close();
	        } catch (FileNotFoundException e) {
	            System.err.println("File not found");
	        } catch (IOException e) {
	            System.err.println("Unable to read the file.");
	        }
	     }
}
