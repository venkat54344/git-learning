package com.venkat;

import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		/*
		 * FileInputStream fi = null; FileOutputStream fo = null; // FileReader f =null;
		 * // f = new FileReader("C:\\Users\\venkat\\Downloads\\input.txt"); fi =new
		 * FileInputStream("C:\\Users\\venkat\\Downloads\\input.txt"); fo =new
		 * FileOutputStream("C:\\Users\\venkat\\Downloads\\output.txt"); int temp;
		 * while((temp=fi.read()) != -1) { fo.write((byte)temp); }
		 */

		System.out.println("hhhh");

		System.out.println("FileHandling added extra here.....");


Student s = new Student(1, "venkat");
System.out.println(s.hashCode());
	}

}
