package com.venkat;

import java.util.Scanner;

 class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
        	System.out.println("enter");
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
 class MyRegex {
	 
	    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
	    String pattern =num+"."+num+"."+num+"."+num;
	    
	}
//Write your code here
